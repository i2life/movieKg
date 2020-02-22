package com.zhiying.moviekg;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(annotationClass= Mapper.class, basePackages = {"com.zhiying.moviekg.db.dao"})
public class MoviekgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviekgApplication.class, args);
    }

}
