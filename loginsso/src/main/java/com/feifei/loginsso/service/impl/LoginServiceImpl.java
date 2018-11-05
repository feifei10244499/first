package com.feifei.loginsso.service.impl;

import com.feifei.loginsso.dao.LoginDao;
import com.feifei.loginsso.entity.User;
import com.feifei.loginsso.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public User get(String id) {
        return loginDao.get(id);
    }
}
