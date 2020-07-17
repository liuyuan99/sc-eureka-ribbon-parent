package com.liuyuan.log.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @RequestMapping("log")
    public String log(String s){
        System.out.println(s);
        return s;
    }
}
