package com.doubledimple.shardingtest.service;

import com.doubledimple.shardingtest.entity.page.PaginationResult;
import com.doubledimple.shardingtest.entity.pojo.User;
import com.doubledimple.shardingtest.entity.query.UserQuery;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> queryAllUser();

    /**
     * 根据条件查询列表
     */
    public List<User> findListByParam(UserQuery param);

    /**
     * 根据条件查询列表
     */
    public Integer findCountByParam(UserQuery param);

    /**
     * 分页查询
     */
    public PaginationResult<User> findListByPage(UserQuery param);

    /**
     * 新增
     */
    public Integer add(User bean);

    /**
     * 批量新增
     */
    public Integer addBatch(List<User> listBean);

    /**
     * 根据主键修改
     */
    public Integer updateByPrimaryKey(User bean  ,Long userId);


    /**
     * 根据主键删除
     */
    public Integer deleteByPrimaryKey(Long userId);


    /**
     * 根据primaryKey获取对象
     */
    public User getUser1ByPrimaryKey(Long userId);
}
