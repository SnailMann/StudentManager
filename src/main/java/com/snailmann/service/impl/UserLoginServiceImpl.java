package com.snailmann.service.impl;


import com.snailmann.mapper.UserMapper;
import com.snailmann.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.snailmann.service.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkLogin(String username, String password) throws Exception {

        User user = userMapper.findUserByName(username);
        //原理就是通过jsp input传回来的username，查找是否数据库里是否有这个username，如果有就把数据库里
        //对应的password与input传回来的password相对比，如果正确就返回user,不正确就返回Null
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }


    }

    @Override
    public boolean findUser(String username, String userType) throws Exception {
        User user = userMapper.findUserByName(username);
        //获得USER,判断权限是否一致
        if (user != null && user.getType().equals(userType)) {
            return true;
        } else {
            return false;
        }
    }


}
