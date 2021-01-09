package com.alex.lrface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.alex.lrface.mapper")
@SpringBootApplication
public class LrfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrfaceApplication.class, args);
    }

}
