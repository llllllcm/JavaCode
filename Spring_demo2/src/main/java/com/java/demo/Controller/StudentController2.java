package com.java.demo.Controller;

import org.springframework.stereotype.Service;

@Service //将当前类存储到spring当中
public class StudentController2 {
    public void sayHi() {
        System.out.println("do student controller sayHi()");
    }
}
