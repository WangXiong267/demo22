package com.qianfeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qianfeng.User;
import com.qianfeng.dao.UserMapper;
import com.qianfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/6/27
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser(){
        QueryWrapper wrapper=new QueryWrapper();
        List<User> list = userMapper.selectList(wrapper);
        return list;
    }

    @Override
    public User findOne(String id) {
        System.out.println("laile ");
        User list = userMapper.selectById(id);
        return list;
    }

}
