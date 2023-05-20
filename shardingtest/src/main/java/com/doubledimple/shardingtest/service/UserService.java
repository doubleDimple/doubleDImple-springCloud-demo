package com.doubledimple.shardingtest.service;

import com.doubledimple.shardingtest.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> queryAllUser();
}
