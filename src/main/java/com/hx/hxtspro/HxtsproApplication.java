package com.hx.hxtspro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hx.hxtspro.dao")
public class HxtsproApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxtsproApplication.class, args);
    }

}
