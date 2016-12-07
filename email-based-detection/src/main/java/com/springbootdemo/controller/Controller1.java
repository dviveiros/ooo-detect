package com.springbootdemo.controller;

import com.springbootdemo.service.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {

    private final Service1 service1;

    @Autowired
    public Controller1(Service1 service1) {
        this.service1 = service1;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return service1.sayHello();
    }
}
