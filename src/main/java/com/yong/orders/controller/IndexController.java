package com.yong.orders.controller;

import com.yong.orders.service.UserService;
import com.yong.orders.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yong.a.liang on 6/14/2017.
 */

@RestController
public class IndexController {

    @Autowired
    UserService userService;


    @GetMapping("/index")
    public String getInitMessage(){
        return "Hello World!";
    }

    @GetMapping("/info")
    public boolean getInitInfo(){
        return true;
    }
    }
