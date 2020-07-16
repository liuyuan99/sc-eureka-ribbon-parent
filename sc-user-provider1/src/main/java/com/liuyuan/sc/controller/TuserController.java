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
public class TuserController {

    @Autowired
    ITuserService iTuserService;

    @RequestMapping("getuser")
    public String getUserNameById(@RequestParam(value = "uid",defaultValue = "")Integer id){
        return "   username"+id+"@@@@111";
    }

    @RequestMapping(value = "testlist")
    public List<String> gets(){
        ArrayList<String> list = new ArrayList<>();
        list.add("wahaha111");
        list.add("xiaoyangren111");
        return list;
    }

    //查询数据
    @RequestMapping("ulist")
    public List<Tuser> getUserList(){
        List<Tuser> list = iTuserService.list(null);
        return list;
    }
}

