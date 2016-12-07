package com.springbootdemo.service;

import com.springbootdemo.configuration.ConnectionConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    private String env;
    private ConnectionConfiguration configuration;

    @Autowired
    public Service1(ApplicationArguments args, ConnectionConfiguration configuration) {

        this.configuration = configuration;

        if (args.containsOption("env")) {
            this.env = args.getOptionValues("env").get(0);
        }
    }

    public String sayHello() {
        return "Hello World. Username " + configuration.getUsername()
                + ". Remote addr " + configuration.getRemoteAddress() + ". Env = " + env;
    }
}
