package com.qianfeng.controller;

import com.qianfeng.User;
import com.qianfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/6/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("/findUser")
    public List<User> findAll(){
        List<User> user = userService.findUser();
        return user;
    }


    @RequestMapping("/findOne")
    public User findOne(@RequestParam String id){
        System.out.println("根据id查询");
        User user = userService.findOne(id);
        return user;
    }
}
