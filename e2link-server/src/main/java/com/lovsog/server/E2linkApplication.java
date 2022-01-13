package com.lovsog.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author Lovsog
 * 2022/1/12
 **/

@SpringBootApplication
@MapperScan("com.lovsog.server.mapper")
public class E2linkApplication {
    public static void main(String[] args) {
        SpringApplication.run(E2linkApplication.class, args);
    }
}
