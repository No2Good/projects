/**
 * 公司：金刚葫芦娃
 * 文件名：CarportController
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 10:59
 * 描述：
 */

package com.smartparking.controller;

import com.smartparking.dao.CarportDao;
import com.smartparking.dao.ReserveOrdersDao;
import com.smartparking.model.Carport;
import com.smartparking.model.CarportQuery;
import com.smartparking.model.ReserveOrders;
import com.smartparking.service.CarportService;
import com.smartparking.service.ReserveOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ReserveOrders")
public class ReserveOrdersController {

    @Autowired
    private ReserveOrdersService reserveOrdersService;

    @Autowired
    private CarportService carportService;


    @RequestMapping("/save.do")
    public String save(HttpSession session,ReserveOrders reserveOrders, Model model){
        reserveOrders.setUserId((Integer) session.getAttribute("userId"));
        Carport carport = new Carport();
        carport.setEndTime(new Date(new Date().getTime() + 30*60*1000));
        carport.setCarportId(reserveOrders.getCarportId());
        carportService.updateCarportReserve(carport);

        reserveOrders.setStartTime(new Date());
        reserveOrders.setEndTime(new Date(new Date().getTime() + 30*60*1000));
        reserveOrdersService.save(reserveOrders);

        return "redirect:list.do";
    }


    @RequestMapping("/list.do")
    public String list(HttpSession session, Model model){
        ReserveOrders reserveOrders = new ReserveOrders();
        reserveOrders.setUserId((Integer) session.getAttribute("userId"));
        reserveOrders.setEndTime(new Date());
        List<ReserveOrders> reserveOrdersList = reserveOrdersService.selectAll(reserveOrders);
        model.addAttribute("roList",reserveOrdersList);

        return "reserveOrders/list";
    }

}
