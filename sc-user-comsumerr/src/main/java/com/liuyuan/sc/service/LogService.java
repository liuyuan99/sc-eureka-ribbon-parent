package com.liuyuan.sc.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sclog")
public interface LogService {

    @RequestMapping("/log")
    public String log(@RequestParam("log")String log);

}
