package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/index")
    public Object getIndex() {
        return "index.html";
    }

    /**
     * 请求重定向
     * @return
     */
    @RequestMapping("/rd")
    public Object rd() {
        return "redirect:/index.html";
    }
    /**
     * 请求转发
     * @return
     */
    @RequestMapping("/fw")
    public Object fw() {
        return "forward:/index.html";
    }
}
