package com.java.demo.Component;

import com.java.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
@Controller
@Order(100)
public class UserBeans {
    @Bean(name = {"user","userEntity"})
    public User getUser() {
        User user = new User();
        user.setAge(19);
        user.setUsername("jay");
        user.setUid(10);
        user.setPassword("123456");
        return user;
    }
    @Bean
    public User getUser2() {
        User user = new User();
        user.setAge(22);
        user.setUsername("zhou");
        user.setUid(100);
        user.setPassword("123");
        return user;
    }
}
