package com.medical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.medical.mapper")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
