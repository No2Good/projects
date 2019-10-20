/**
 * 公司：金刚葫芦娃
 * 文件名：UserController
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 17:07
 * 描述：
 */

package com.smartparking.controller;

import com.smartparking.model.Car;
import com.smartparking.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Car")
public class CarsController {

    @Autowired
    private CarService carService;

    @RequestMapping("/listCarByUserId.do")
    public String listCarByUserId(Model model, HttpSession session){
        Integer userId= (Integer) session.getAttribute("userId");
        List<Car> carList = carService.selectCarByUserId(userId);
        model.addAttribute("carList", carList);
        model.addAttribute("userId",userId);


        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        return "car/list";
    }

    @RequestMapping("/toSave.do")
    public String toSave(Integer userId,Model model){
        model.addAttribute("userId",userId);

        return "car/save";
    }

    @RequestMapping("/save.do")
    public String save(Car car, Model model,HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        car.setUserId(userId);
        carService.saveCar(car);
        model.addAttribute("userId", car.getUserId());

        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");


        return "redirect:listCarByUserId.do";
    }

    @RequestMapping("/deleteCar.do")
    public String deleteCar(Integer carId, Model model){
        Car car = carService.selectCarById(carId);
        model.addAttribute("userId",car.getUserId());
        carService.deleteCar(carId);

        return "redirect:listCarByUserId.do";
    }


}
