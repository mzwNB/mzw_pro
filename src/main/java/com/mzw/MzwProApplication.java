package com.mzw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = "com.mzw.dao")
public class MzwProApplication {

    public static void main(String[] args) {
        SpringApplication.run(MzwProApplication.class, args);
    }

}
