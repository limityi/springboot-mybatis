package com.spring.boot.controller;


import com.spring.boot.entity.User;
import com.spring.boot.mapper.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class UserController {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/user/{id}")
    public com.spring.boot.mybatis.entity.User user(@PathVariable Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    @GetMapping(value = "/user/save")
    public String save(){
        User user=new User();
        user.setName("limit1");
        user.setAge(new Random().nextInt(100));
        int result=sqlSessionTemplate.insert("com.spring.boot.mapper.UserMapper.insert",user);
        if(result>0){
            return "success";
        }else {
            return "fail";
        }
    }
}
