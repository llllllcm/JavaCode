package com.java.demo.controller;

import com.java.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController2 {
    @Resource
    private User user;

    public void printUser2() {
        System.out.println("user - >"+ user);
    }
}
