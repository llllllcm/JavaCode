package com.java.demo.Controller;

import org.springframework.stereotype.Controller;

@Controller //将当前类存储到spring当中
public class StudentController {
    public void sayHi() {
        System.out.println("do student controller sayHi()");
    }
}
