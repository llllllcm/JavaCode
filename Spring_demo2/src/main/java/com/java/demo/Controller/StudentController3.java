package com.java.demo.Controller;

import org.springframework.stereotype.Repository;

@Repository //将当前类存储到spring当中
public class StudentController3 {
    public void sayHi() {
        System.out.println("do student controller sayHi()");
    }
}
