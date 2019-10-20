/**
 * 公司：金刚葫芦娃
 * 文件名：Test
 * 作者：ZhaoJinGang
 * 时间：2019/6/28 17:19
 * 描述：
 */

package com.smartparking;

import com.smartparking.model.Carport;
import com.smartparking.service.CarportService;
import com.smartparking.service.impl.CarportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {

    public static void save() {

        CarportService carportService = new CarportServiceImpl();
        for (int i = 1; i <= 4; i++){
            String area = "";
            switch (i){
                case 1:
                    area = "A";
                    break;
                case 2:
                    area = "B";
                    break;
                case 3:
                    area = "C";
                    break;
                case 4:
                    area = "D";
                    break;
            }

            for (int j = 1; j <= 300; j++){
                String position = "";
                if(j < 10){
                    position = "00"+j;
                }else if(j < 100){
                    position = "0"+j;
                }else {
                    position = ""+j;
                }
                String cposition = area+position;
                Carport carport = new Carport();
                carport.setGarageId(i);
                carport.setCposition(cposition);

                carportService.save(carport);
            }

        }

    }

}
