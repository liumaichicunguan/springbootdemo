package com.qgiuaooe.springbootdemo.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.qgiuaooe.springbootdemo.mapper")
public class MyBatisPlusConfig {

}
