package com.java.demo.Controller;

import com.java.demo.entity.User;
import com.java.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {


    @Resource(name = "user")//在Spring中查找名为user的对象
    private User user1;

    public void sayHi() {
        System.out.println("com.java.demo -> do UserController sayHI()");
        user1.getUsername();
    }
}
