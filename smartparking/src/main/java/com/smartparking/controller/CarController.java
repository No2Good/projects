package com.smartparking.controller;

import com.alibaba.fastjson.JSONObject;
import com.smartparking.model.Car;
import com.smartparking.service.CarService;
import com.smartparking.utils.DistinguishUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    private DistinguishUtil distinguishUtil;

    @RequestMapping("/toDisCar.do")
    public String toDisCar() {
        return "upload_pic";
    }

    @RequestMapping("/disCar.do")
    public String dis_car(HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws IOException {
        String carNumber = "";
        String result = "";
        distinguishUtil = DistinguishUtil.getInstance();
        //获取服务器中保存文件的路径
        String path = request.getSession().getServletContext().getRealPath("")+"/upload/record/";
        System.out.println(path);
        //获取解析器
        CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断是否是文件
        if(resolver.isMultipart(request)) {
            //进行转换
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) (request);
            //获取所有文件名称
            Iterator<String> it = multiRequest.getFileNames();
            while (it.hasNext()) {
                //根据文件名称取文件
                MultipartFile file = multiRequest.getFile(it.next());
                String fileName = file.getOriginalFilename();
                String localPath = path + fileName;
                //创建一个新的文件对象，创建时需要一个参数，参数是文件所需要保存的位置
                File newFile = new File(localPath);
                if (newFile.getParentFile() != null || !newFile.getParentFile().isDirectory()) {
                    // 创建父文件夹
                    newFile.getParentFile().mkdirs();
                }
                //上传的文件写入到指定的文件中
                file.transferTo(newFile);
                result  = distinguishUtil.dis_pic(fileName);
            }
            System.out.println("the result it : " + result);
            JSONObject jsonObject = JSONObject.parseObject(result);
            String car_number =
                    jsonObject.getJSONArray("plates")
                            .getJSONObject(0)
                            .getString("txt");
//            System.out.println("JsonObj : " + jsonObject.getString("plates"));
            carNumber = car_number;
        }

        Integer userId = (Integer) session.getAttribute("userId");
        Car car = new Car();
        car.setUserId(userId);
        car.setLicenseNumber(carNumber);
        carService.saveCar(car);
        List<Car> carList = carService.selectCarByUserId(userId);
        model.addAttribute("carList",carList);

        return "car/list";
    }
}
