package com.example.mall.service;

import com.example.mall.pojo.User;
import com.example.mall.vo.ResponseVo;

public interface IUserService {

    /*
     *注册
     * */
        ResponseVo<User> register(User user);
    /*
    *登录
    * */
        ResponseVo<User> login(String username,String password);
}
