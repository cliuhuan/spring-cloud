package com.liuhuan.study.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiuHuan
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.liuhuan.study.springcloud.alibaba.mapper"})
public class MyBatisConfig {
}
