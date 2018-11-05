package com.feifei.loginsso.controller;

import com.feifei.loginsso.entity.User;
import com.feifei.loginsso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login/{id}")
    @ResponseBody
    public User test(@PathVariable String id){
        User u = loginService.get(id);
        System.out.print(u);
        return u;
    }
}
