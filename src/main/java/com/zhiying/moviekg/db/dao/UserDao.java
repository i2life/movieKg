package com.zhiying.moviekg.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    void insertUser(@Param("name")String userName);
}
