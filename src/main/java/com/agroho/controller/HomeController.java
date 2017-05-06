package com.agroho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: rezaul || Date: 5/4/17.
 */
@Controller("/")
public class HomeController {

    @RequestMapping(value = "")
    public String goIndex(){

        return "home";
    }

    @RequestMapping(value = "/home")
    public String goHome(){

        return "home";
    }

    @RequestMapping(value = "/hello")
    public String viewGreeting(){

        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login(){

        return "login";
    }
}
