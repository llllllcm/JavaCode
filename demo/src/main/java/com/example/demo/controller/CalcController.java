package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
    @RequestMapping("/m")
    public String calc(Integer n1,Integer n2) {
        return String.format("<h1>计算的结果是：%d</h1><a href='javascript:history.go(-1);'>返回</a>",
                n1+n2);
    }
}
