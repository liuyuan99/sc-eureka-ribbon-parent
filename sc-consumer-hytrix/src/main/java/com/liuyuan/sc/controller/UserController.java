package com.liuyuan.sc.controller;

import com.liuyuan.sc.Tuser;
import com.liuyuan.sc.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserService userService;


    @RequestMapping("getnamef")
    public String getUserNamef(@RequestParam(defaultValue = "0")Integer id){
        String name = userService.getNameById(id);
        System.out.println("this name is "+name);
        return name;
    }

    @RequestMapping("getname")
    public String getUserName(@RequestParam(defaultValue = "0")Integer id){
        String name = restTemplate.getForObject("http://scuserprovider/getuser?uid=" + id, String.class);
        System.out.println("this name "+name);
        return name;
    }

    @RequestMapping("mylistf")
    public List<String> list(){
        List<String> testlist = userService.testlist();
        System.out.println("name is"+testlist);
        return testlist;
    }

    @RequestMapping("mylist")
    public List<String> mylist(){
        ArrayList<String> testlist = restTemplate.getForObject("http://scuserprovider/testlist",ArrayList.class);
        return testlist;
    }

    @RequestMapping("getUserList")
    @HystrixCommand(fallbackMethod = "getUserListFailBack")
    public List<Tuser> getUserList(){
        List<Tuser> userlist = userService.getUserList();
        return userlist;
    }

    /*@RequestMapping("getUserListFailBack")*/
    public List<Tuser> getUserListFailBack(){
        ArrayList<Tuser> tusers = new ArrayList<>();
        Tuser tuser = new Tuser(20,"admin","123456","男");
        tusers.add(tuser);
        return tusers;
    }
}
