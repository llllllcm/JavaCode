package com.example.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

@Component
public class ReadYml {
    @Autowired
    private StudentComponent studentComponent;

    @PostConstruct
    public void postConstruct() {
        System.out.println(studentComponent);
    }
}
