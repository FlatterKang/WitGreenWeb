package com.witgreen.iot.controller;


import com.witgreen.iot.bean.User;
import com.witgreen.iot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInforController {

    @Autowired
    UserService userService;


    //按用户名访问客户个人信息主页
    @GetMapping("/userpage/{username}")
    @ResponseBody
    String showUserInforByUsername(@PathVariable(value="username") String userName){

        //1.   username->user's information
        //2.   user's information->view(user_infor.html)
        //3.   return “user_infor"

        return "You are request "+userName+" userInfor";
    }

    //按照user的id查询user的信息
    @GetMapping("userinfor/{id}")
    String showUserInforById(@PathVariable(value = "id") Integer id, Model model){
        User user= userService.getDetailById(id);

        model.addAttribute("user",user);
        return "user_infor";
    }
}
