package com.java.demo.Component;

import com.java.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
@Order(10)
public class UserBeans2 {

    @Bean
    public User getUser2() {
        User user = new User();
        user.setAge(22);
        user.setUsername("zhouZou");
        user.setUid(100);
        user.setPassword("123");
        return user;
    }
}
