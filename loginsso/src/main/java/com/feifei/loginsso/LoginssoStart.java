package com.feifei.loginsso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.feifei.loginsso.dao")
@ComponentScan("com.feifei.loginsso")
public class LoginssoStart {

    public static void main(String[] args){
        SpringApplication.run(LoginssoStart.class,args);
    }
}
