/**
 * 公司：金刚葫芦娃
 * 文件名：UserController
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 17:07
 * 描述：
 */

package com.smartparking.controller;

import com.smartparking.model.Car;
import com.smartparking.model.CarQuery;
import com.smartparking.model.User;
import com.smartparking.model.UserQuery;
import com.smartparking.service.CarService;
import com.smartparking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CarService carService;

    //登录jsp
    @RequestMapping("/toRegister.do")
    public String toRegister(){
        return "user/register";
    }

    //登录
    @RequestMapping("/register.do")
    public String register(User user, Model model, HttpSession session){
        UserQuery query = new UserQuery();
        query.setUserAccount(user.getUserAccount());
        List<User> userList = userService.selectUsertByCondition(query);
        User user1 = userList.get(0);
        Integer userId = user1.getUserId();
        String result = userService.register(user);
        if ("no".equals(result)){
            model.addAttribute("resultRegister","账号或密码错误");
            return "redirect:toRegister.do";
        }
//        if ("800100".equals(user.getUserAccount())){
//            return  "user/manager";
//        }
        model.addAttribute("userId",userId);
        session.setAttribute("userId",userId);
        return "user/index";
    }


    //注册jsp
    @RequestMapping("/toSave.do")
    public String toSave(){
        return "user/save";
    }

    //注册
    @RequestMapping("/save.do")
    public String save(User user,Model model){
        userService.saveUser(user);
        model.addAttribute("resultSave","ok");
        model.addAttribute("userAccount",user.getUserAccount());
        return "redirect:toRegister.do";
    }


    //selectUserAll
    @RequestMapping("/selectUserAll.do")
    public String selectUserAll(Model model){
        List<User> userList = userService.selectUserAll();
        model.addAttribute("userList",userList);

        return "user/list";
    }


    // selectUsertByCondition
    @RequestMapping("/listUser.do")
    public String listUser(UserQuery query, Model model){
        List<User> userList = userService.selectUsertByCondition(query);
        model.addAttribute("userList",userList);
        model.addAttribute("query",query);

        return "user/list";
    }


    // listUser.do
    @RequestMapping("/toUpdate.do")
    public String toUpdate(Integer id, Model model,HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        User user = userService.selectUserById(userId);
        model.addAttribute("user",user);

        return "user/update";
    }


    @RequestMapping("/toUserInfo.do")
    public String toUserInfo(Integer id, Model model,HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        User user = userService.selectUserById(userId);
        model.addAttribute("user", user);

        return "user/userInfo";
    }

    @RequestMapping("update.do")
    public String update(User user,Model model){
        userService.updateUser(user);
        model.addAttribute("id",user.getUserId());

        return "redirect:toUserInfo.do";
    }

}
