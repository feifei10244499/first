package com.feifei.goodscart.controller;

import com.feifei.goodscart.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GoodscartController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/goodscart/user/{id}")
    public void findById(@PathVariable String id){
        User u = this.restTemplate.getForObject("http://192.168.2.130:8881/login/" + id, User.class);
        System.out.print(u);
    }
}
