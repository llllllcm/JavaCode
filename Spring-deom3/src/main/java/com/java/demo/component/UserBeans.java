package com.java.demo.component;

import com.java.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBeans {
    @Bean
    public User user() {
        //伪代码
        User user = new User();
        user.setId(1);
        user.setName("张三");
        return user;
    }
}
