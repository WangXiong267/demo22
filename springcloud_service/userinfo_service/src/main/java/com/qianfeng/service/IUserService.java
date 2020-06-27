package com.qianfeng.service;

import com.qianfeng.User;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/6/27
 */
public interface IUserService {
    List<User> findUser();

    User findOne(String id);
}
