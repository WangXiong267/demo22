package com.qianfeng.controller;

import com.qianfeng.IUserFeign;
import com.qianfeng.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 这是老王提交的代码
 * @Author Wang
 * @Date 2020/6/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public IUserFeign iUserFeign;

    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        List<User> user = iUserFeign.findAll();
        return user;
    }
    @RequestMapping("/findOne")
    User findOne(@RequestParam String id){
        System.out.println("过来了");
        User user = iUserFeign.findOne(id);
        return user;
    }
}
