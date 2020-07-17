package com.liuyuan.sc.controller;


import com.liuyuan.sc.Tuser;
import com.liuyuan.sc.service.ITuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuyuan
 * @since 2020-07-16
 */
@RestController
@RequestMapping("tuser")
public class TuserController1 {

    @Autowired
    ITuserService iTuserService;

    //查询数据
    @RequestMapping("a")
    public String getA(){
        return "this is A";
    }


}

