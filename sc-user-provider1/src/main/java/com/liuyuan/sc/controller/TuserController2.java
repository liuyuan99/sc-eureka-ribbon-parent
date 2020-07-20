package com.liuyuan.sc.controller;


import com.liuyuan.sc.service.ITuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyuan
 * @since 2020-07-16
 */
@RestController
@RequestMapping("tusers")
public class TuserController2 {

    @Value("${mykey}")
    private String s;

    @Autowired
    ITuserService iTuserService;

    //查询数据
    @RequestMapping("b")
    public String getB(){
        return "this is B";
    }


}

