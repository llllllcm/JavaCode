package com.java.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void sayHi() {
        System.out.println("do UserService sayHi() ");
    }
}
