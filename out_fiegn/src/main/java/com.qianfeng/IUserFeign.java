package com.qianfeng;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author Wang
 * @Date 2020/6/27
 */
@FeignClient(name = "userinfo-service")
public interface IUserFeign {
    @RequestMapping("/user/findUser")
    List<User> findAll();

    @RequestMapping("/user/findOne")
    User findOne(@RequestParam("id") String id);

}
