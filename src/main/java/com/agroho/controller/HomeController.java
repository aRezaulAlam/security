package com.agroho.controller;

import com.agroho.domain.User;
import com.agroho.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Author: rezaul || Date: 5/4/17.
 */
@RestController()
public class HomeController {

    @Autowired
    UserService userService;

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

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User register(@RequestBody User user){

       user = userService.saveUser(user);

        return user;
    }
}
