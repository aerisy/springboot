package com.banana.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/3 0003.
 */
@Controller
//@EnableAutoConfiguration
@EnableConfigurationProperties
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String sayHello() {
        return "Hello Spring Boot!!";
    }

    @RequestMapping("/message")
    @ResponseBody
    String message() {
        System.out.println("MESSAGE");
        return "MESSAGE";
    }

}
