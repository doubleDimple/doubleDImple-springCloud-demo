package com.doubledimple.shardingtest.service.impl;

import com.doubledimple.shardingtest.entity.enums.PageSize;
import com.doubledimple.shardingtest.entity.page.PaginationResult;
import com.doubledimple.shardingtest.entity.page.SimplePage;
import com.doubledimple.shardingtest.entity.pojo.User;
import com.doubledimple.shardingtest.entity.query.UserQuery;
import com.doubledimple.shardingtest.mapper.UserMapper;
import com.doubledimple.shardingtest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper<User,UserQuery> userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    /**
     * 根据条件查询列表
     */
    public List<User> findListByParam(UserQuery param) {
        List<User> list = this.userMapper.selectList(param);
        return list;
    }

    /**
     * 根据条件查询列表
     */
    public Integer findCountByParam(UserQuery param) {
        Integer count = this.userMapper.selectCount(param);
        return count;
    }

    /**
     * 分页查询方法
     */
    public PaginationResult<User> findListByPage(UserQuery param) {
        int count = this.userMapper.selectCount(param);
        int pageSize = param.getPageSize()==null? PageSize.SIZE15.getSize():param.getPageSize();
        int pageNo = 0;
        if (null != param.getPageNo()) {
            pageNo=param.getPageNo();
        }
        SimplePage page = new SimplePage(pageNo, count, pageSize);
        param.setPage(page);
        List<User> list = this.userMapper.selectList(param);
        PaginationResult<User> result = new PaginationResult<User>(page, list);
        return result;
    }

    /**
     * 新增
     */
    public Integer add(User bean){
        return this.userMapper.insert(bean);
    }

    /**
     * 批量新增
     */
    public Integer addBatch(List<User> listBean){
        if (listBean == null || listBean.isEmpty()) {
            return 0;
        }
        return this.userMapper.insertBatch(listBean);
    }

    /**
     * 修改
     */
    public Integer updateByPrimaryKey(User bean,Long userId){
        return this.userMapper.updateByPrimaryKey(bean,userId);
    }

    /**
     * 删除
     */
    public Integer deleteByPrimaryKey(Long userId){
        return this.userMapper.deleteByPrimaryKey(userId);
    }

    /**
     * 根据primaryKey获取对象
     */
    public User getUser1ByPrimaryKey(Long userId){
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
