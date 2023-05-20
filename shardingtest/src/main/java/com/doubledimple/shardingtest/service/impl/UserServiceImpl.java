package com.doubledimple.shardingtest.service.impl;

import com.doubledimple.shardingtest.entity.User;
import com.doubledimple.shardingtest.mapper.UserMapper;
import com.doubledimple.shardingtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
