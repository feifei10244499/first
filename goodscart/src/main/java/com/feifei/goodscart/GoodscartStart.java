package com.feifei.goodscart;

import org.apache.ibatis.annotations.ResultType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.feifei.goodscart.dao")
@ComponentScan("com.feifei.goodscart")
public class GoodscartStart {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(GoodscartStart.class,args);
    }
}
