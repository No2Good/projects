/**
 * 公司：金刚葫芦娃
 * 文件名：CarportController
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 10:59
 * 描述：
 */

package com.smartparking.controller;

import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;
import com.smartparking.service.CarportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Carport")
public class CarportController {

    @Autowired
    private CarportService carportService;

    @RequestMapping("/toList.do")
    public String toList(){

        return "carport/list";
    }

    @RequestMapping("/listCarportByCondition.do")
    public String listCarByUserId(HttpSession session, CarportQuery query, Model model){
        query.setNowTime(new Date());
        carportService.updateCarport(query);

        query.setIsUse("否");
        List<Carport> carportList = carportService.selectCarportByCondition(query);
        model.addAttribute("carportList", carportList);
        model.addAttribute("query",query);

        session.setAttribute("garageId",query.getGarageId());

        return "carport/list";
    }


    @RequestMapping("/listAll.do")
    public String listAll(HttpSession session, CarportQuery query, Model model) {
        if (query.getCarportId() == null) {
            query.setGarageId(1);
        }
        query.setNowTime(new Date());
        carportService.updateCarport(query);

        List<Carport> carportList = carportService.selectCarportByCondition(query);
        model.addAttribute("carportList", carportList);
        model.addAttribute("query", query);

        session.setAttribute("garageId", query.getGarageId());

        return "carport/listAll";
    }
}


    /*
    @RequestMapping("/save.do")
    public void save(){

        for (int g = 1;g<=4;g++){

            for (int i = 1; i <= 4; i++) {
                String area = "";
                switch (i) {
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

                for (int j = 1; j <= 300; j++) {
                    String position = "";
                    if (j < 10) {
                        position = "00" + j;
                    } else if (j < 100) {
                        position = "0" + j;
                    } else {
                        position = "" + j;
                    }
                    String cposition = area + position;
                    Carport carport = new Carport();
                    carport.setGarageId(g);
                    carport.setCposition(cposition);

                    carportService.save(carport);
                }
            }
        }
    }

}**/
