package com.cjl.impl;

import com.cjl.service.LoginService;

public class LoginServiceImpl implements LoginService {
    @Override
    public boolean isLogin(String name, String password) {
        if ("hello".equals(name) && "world".equals(password)){
            return true;
        }
        return false;
    }
}
