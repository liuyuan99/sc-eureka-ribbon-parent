package com.liuyuan.sc.service;

import com.liuyuan.sc.Tuser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceFailBack implements UserService {

    @Override
    public String getNameById(Integer uid) {
        return "没有得到【"+uid+"】的用户";
    }

    @Override
    public List<String> testlist() {
        ArrayList<String> list = new ArrayList<>();
        list.add("旺旺碎冰冰");
        list.add("可口可乐");
        return list;
    }

    @Override
    public List<Tuser> getUserList() {
        ArrayList<Tuser> tusers = new ArrayList<>();
        Tuser tuser = new Tuser(20,"adminnn","123123","男");
        tusers.add(tuser);
        return tusers;
    }
}
