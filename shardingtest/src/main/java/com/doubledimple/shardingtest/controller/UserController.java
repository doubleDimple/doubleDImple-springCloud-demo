package com.doubledimple.shardingtest.controller;

import com.doubledimple.shardingtest.common.IDUtil;
import com.doubledimple.shardingtest.entity.page.PaginationResult;
import com.doubledimple.shardingtest.entity.pojo.User;
import com.doubledimple.shardingtest.entity.query.UserQuery;
import com.doubledimple.shardingtest.service.UserService;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/testInsertUser")
    public ResponseEntity testInsertUser(){
        for(int i=0; i<20 ;i++){
            User user = new User();
            user.setUserId(IDUtil.getRandomId());
            user.setAddress("北京市昌平区");
            user.setAge(10+i);
            user.setBirthday("1992-01-01");
            user.setUserName("小乐"+i);
            user.setSex(i%2+1);
            userService.addUser(user);
        }
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping("/testQueryUser")
    public ResponseEntity<PaginationResult<User>> testQueryUser(@RequestBody UserQuery userQuery){
        PaginationResult<User> result = this.userService.findListByPage(userQuery);
        userQuery.setOrderBy("user_id");
        ResponseEntity<PaginationResult<User>> responseEntity = new ResponseEntity<>(result,HttpStatus.OK);
        return responseEntity;
    }
}
