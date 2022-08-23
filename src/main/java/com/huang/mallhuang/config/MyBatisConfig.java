package com.huang.mallhuang.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.huang.mallhuang.mbg.mapper","com.huang.mallhuang.dao"})
public class MyBatisConfig {

}
