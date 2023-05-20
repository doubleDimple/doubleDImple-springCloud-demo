package com.doubledimple.shardingtest.mapper;

import com.doubledimple.shardingtest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    void addUser(User user);

    List<User> queryAllUser();
}
