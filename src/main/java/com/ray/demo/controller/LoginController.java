package com.ray.demo.controller;



import com.ray.demo.entity.User;
import com.ray.demo.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
    //将Service注入Web层
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        User User = userService.loginIn(name,password);
        if(User!=null){
            return "success";
        }else {
            return "error";
        }
    }
}