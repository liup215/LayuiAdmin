package com.hidear.admin.modular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by acer on 2017/7/22.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index.html";
    }

    @RequestMapping("/main")
    public String main(){
        return "/main.html";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){

        return "/login.html";
    }
}
