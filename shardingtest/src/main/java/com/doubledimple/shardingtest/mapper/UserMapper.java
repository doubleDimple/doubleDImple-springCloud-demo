package com.doubledimple.shardingtest.mapper;

import com.doubledimple.shardingtest.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper<T,P> extends BaseMapper<T,P> {

    /**
     * 根据primaryKey更新
     */
    public Integer updateByPrimaryKey(@Param("bean") T t, @Param("userId") Long userId);


    /**
     * 根据primaryKey删除
     */
    public Integer deleteByPrimaryKey(@Param("userId") Long userId);


    /**
     * 根据primaryKey获取对象
     */
    public T selectByPrimaryKey(@Param("userId") Long userId);


    void addUser(User user);

    List<User> queryAllUser();
}
