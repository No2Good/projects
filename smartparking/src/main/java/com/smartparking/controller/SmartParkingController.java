/**
 * 公司：金刚葫芦娃
 * 文件名：CarportController
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 10:59
 * 描述：
 */

package com.smartparking.controller;

import com.smartparking.model.*;
import com.smartparking.service.CarportService;
import com.smartparking.service.GarageService;
import com.smartparking.service.SmartParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/SmartParking")
public class SmartParkingController {

    @Autowired
    private SmartParkingService smartParkingService;

    @Autowired
    private GarageService garageService;

    @Autowired
    private CarportService carportService;


    @RequestMapping("/toSmartparking.do")
    public String toSmartparking(){

        return "smartparking/list";
    }

    @RequestMapping("/smartparking.do")
    public String smartparking(SmartParking smartParking, HttpSession session, Model model){

        Integer userId = (Integer) session.getAttribute("userId");
        smartParking.setUserId(userId);
        List<SmartParking> smartParkingList = smartParkingService.selectSmartParkingByCondition(smartParking);

        for (SmartParking sp : smartParkingList) {
            CarportQuery query = new CarportQuery();
            query.setCposition(sp.getCarport());
            Garage garage = garageService.selectGarageByGarageName(sp.getGarage());
            query.setGarageId(garage.getGarageId());
            List<Carport> carportList = carportService.selectCarportByCondition(query);
            Carport carport = carportList.get(0);
            String isUse = carport.getIsUse();

            if (isUse.equals("否")){
                model.addAttribute("carportId", carport.getCarportId());

                return "redirect:/ReserveOrders/save.do";
            }else {
                for(int i = 1; i <= 2; i++){
                    CarportQuery carportQuery = new CarportQuery();
                    carportQuery.setCarportId(carport.getCarportId() + i);
                    carportQuery.setGarageId(garage.getGarageId());
                    List<Carport> carports = carportService.selectCarportByCondition(carportQuery);
                    Carport carport1 = carports.get(0);
                    String isUse1 = carport1.getIsUse();
                    if (isUse1.equals("否")){
                        model.addAttribute("carportId", carport.getCarportId() + i);

                        return "redirect:/ReserveOrders/save.do";
                    }
                }
                for(int i = 1; i <= 2; i++){
                    CarportQuery carportQuery = new CarportQuery();
                    carportQuery.setCarportId(carport.getCarportId() - i);
                    carportQuery.setGarageId(garage.getGarageId());
                    List<Carport> carports = carportService.selectCarportByCondition(carportQuery);
                    Carport carport1 = carports.get(0);
                    String isUse1 = carport1.getIsUse();
                    if (isUse1.equals("否")){
                        model.addAttribute("carportId", carport.getCarportId() - i);

                        return "redirect:/ReserveOrders/save.do";
                    }
                }
            }
        }


        return "smartparking/failure";
    }

    @RequestMapping("/save.do")
    public String save(){
        smartParkingService.delete();

        try {
            String encoding="utf-8";//GBK
            String filePath="/smartparkingMapReduce.txt";//要读取的文件路径

            File file=new File(filePath);
            System.out.println(file.isFile());
            System.out.println(file.exists());
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;//每一行的文本内容
                String cityId="";
                String cityName_zhcn="";//中文名称
                String cityNameLong_zhcn="";//中文名称，长名

                int i=0;
                int j=0;
                while((lineTxt = bufferedReader.readLine()) != null){

                    if (lineTxt.length() < 10){
                        continue;
                    }

                    try {
                        String[] str=lineTxt.split("\t");
                        String[] userGarageCarport = str[0].split(",");

                        SmartParking smartParking = new SmartParking();
                        smartParking.setUserId(new Integer(userGarageCarport[0]));
                        smartParking.setGarage(userGarageCarport[1]);
                        smartParking.setCarport(userGarageCarport[2]);
                        smartParking.setTotalTime(new Long(str[1]));

                        List<SmartParking> smartParkingList = smartParkingService.selectSmartParkingByCondition(smartParking);

                        if(smartParkingList != null && smartParkingList.size() > 0){
                            smartParkingService.update(smartParking);
                            System.out.println("正在更新第"+j+"条数据......."+lineTxt);
                            j++;
                        }else {
                            smartParkingService.save(smartParking);
                            System.out.println("正在插入第"+i+"条数据......."+lineTxt);
                            i++;
                        }

                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

        return "success";
    }

}
