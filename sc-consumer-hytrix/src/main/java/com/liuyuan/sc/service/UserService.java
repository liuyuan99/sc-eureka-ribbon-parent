package com.liuyuan.sc.service;

import com.liuyuan.sc.Tuser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "scuserprovider",fallback = UserServiceFailBack.class)
public interface UserService {

    @RequestMapping("/getuser")
    String getNameById(@RequestParam("uid") Integer uid);

    @RequestMapping("/testlist")
    List<String> testlist();

    @RequestMapping("/ulist")
    List<Tuser> getUserList();
}
