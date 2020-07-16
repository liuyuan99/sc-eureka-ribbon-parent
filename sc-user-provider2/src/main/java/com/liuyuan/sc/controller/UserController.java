package com.liuyuan.sc.controller;

import com.liuyuan.sc.Tuser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("getuser")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "")Integer id){
        return "   username"+id+"@@@@222";
    }

    @RequestMapping(value = "testlist")
    public List<String> gets(){
        ArrayList<String> list = new ArrayList<>();
        list.add("wahaha222");
        list.add("xiaoyangren222");
        return list;
    }

    @RequestMapping("ulist")
    public List<Tuser> ulist(){
        return new ArrayList<Tuser>();
    }
}
