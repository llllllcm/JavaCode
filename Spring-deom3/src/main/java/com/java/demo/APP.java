package com.java.demo;

import com.java.demo.controller.UserController;
import com.java.demo.controller.UserController2;
import com.java.demo.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController controller = context.getBean("userController",UserController.class);
        UserController2 controller2 = context.getBean("userController2",UserController2.class);
        controller2.printUser2();
    }
}
