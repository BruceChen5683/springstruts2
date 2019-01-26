package com.cjl.action;

import com.cjl.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String name;
    private String password;

    private LoginService service;

    public void setService(LoginService service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if (service.isLogin(name,password)) {
            return SUCCESS;
        }
        return ERROR;
    }
}
