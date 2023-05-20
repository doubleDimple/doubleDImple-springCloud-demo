package com.doubledimple.shardingtest.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;

    private String userName;

    private Integer age;

    private Integer sex;

    private String birthday;

    private String address;


}
