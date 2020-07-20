package com.liuyuan.sc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    @Value("${mykey}")
    private String myValu;

    @RequestMapping("getval")
    public String getVal(){
        return "the value is :"  + myValu;
    }
}
