/**
 * 公司：金刚葫芦娃
 * 文件名：SmartparkingData
 * 作者：ZhaoJinGang
 * 时间：2019/6/27 19:54
 * 描述：
 */

package com.smartparking.utils.smartparking;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmartparkingData {

    public static void main(String[] args) throws IOException, ParseException {

        //车库
        List<String> garageList = new ArrayList<String>();
        garageList.add("outlets");
        garageList.add("wanke");
        garageList.add("tiansenhui");
        garageList.add("wanda");

        //车位
        List<String> carportList = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
            String area = null;
            switch (i){
                case 0:
                    area = "A";
                    break;
                case 1:
                    area = "B";
                    break;
                case 2:
                    area = "C";
                    break;
                case 3:
                    area = "D";
                    break;
            }
            for (int j = 1; j <= 300; j++){
                String numb = null;
                if (j < 10){
                    numb = "00"+j;
                }else if (j < 100 && j >= 10){
                    numb = "0"+j;
                }else {
                    numb = ""+j;
                }
                carportList.add(area + numb);
            }
        }

        List<String> userList = new ArrayList<String>();
        for (int i = 1; i <= 100; i++){
            userList.add(""+i);
        }


        for(int i = 0; i < 1000; i++){
            String line = "";

            //选车库
            int garageIndex = (int) (Math.random()*4);
            String garage = garageList.get(garageIndex);

            //选车位
            int carportIndex = (int) (Math.random()*1200);
            String carport = carportList.get(carportIndex);

            //选用户
            int userIntex = (int) (Math.random()*100);
            String user = userList.get(userIntex);

            //开始时间
            String startTimeStr = "2019-";
            int month = (int) (Math.random()*6)+1;
            int day = (int) (Math.random()*27)+1;
            int hour = (int) (Math.random()*22)+1;
            int minute = (int) (Math.random()*59)+1;
            startTimeStr += month+"-"+day+" "+hour+":"+minute;
            Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(startTimeStr);

            //结束时间
            int s = (int) (Math.random()*3600000*5)+3600000;
            Date endTime = new Date(startTime.getTime()+s);
            String endTimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(endTime);


            FileWriter fileWriter = new FileWriter(new File("e:/smartparking.txt"), true);
            fileWriter.write(new String(garage+","+carport+",晋K-GV585,"+startTimeStr+","+endTimeStr+",1,是,"+user));
            fileWriter.close();
        }

    }

}
