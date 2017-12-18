package com.p2p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xyyxx005 on 2017/12/18.
 */
@ComponentScan(basePackages = {"com.p2p"})
@MapperScan("com.p2p.mapper")
@SpringBootApplication
public class BackgroudApplocation {
    public static void main(String[] args) {
        SpringApplication.run(BackgroudApplocation.class);
    }
}
