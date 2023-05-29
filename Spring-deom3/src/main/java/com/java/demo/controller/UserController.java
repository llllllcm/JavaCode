package com.java.demo.controller;

import com.java.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }


}
