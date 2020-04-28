package com.lh.mybatis_config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: MybatisPlusConfig.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/04/24 15:43
 */
@Configuration
public class MybatisPlusConfig {
    private final static Logger logger = LoggerFactory.getLogger(MybatisPlusConfig.class);

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

}