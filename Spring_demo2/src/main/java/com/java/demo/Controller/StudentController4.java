package com.java.demo.Controller;

import org.springframework.stereotype.Component;

@Component //将当前类存储到spring当中
public class StudentController4 {
    public void sayHi() {
        System.out.println("do student controller sayHi()");
    }
}
