package com.spring.boot.annotation;

import com.spring.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Results(id = "user",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "height",property = "height")
    })
    @Select("select * from user where id=#{id}")
    User selectOne(int id);

}
