package com.lh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Application.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/04/27 17:14
 */
@SpringBootApplication
@MapperScan("com.lh.mapper")
public class Application {
    public static void main(String[] args){
            SpringApplication.run(Application.class, args);
        }
}