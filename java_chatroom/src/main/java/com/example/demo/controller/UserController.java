package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    @ResponseBody
    public Object login(String username, String password, HttpServletRequest req) {
        // 1. 先去数据库查看，看username能否找到对应的 user 对象
        // 如果能找到就看一下密码是否匹配
        User user = userMapper.selectByName(username);
        if (user == null || !user.getPassword().equals(password)) {
            //只要其中一个条件具备，那么就会登录失败，同时返回一个空的对象
            System.out.println("登录失败！ 用户名或者密码错误！ "+ user);
            return new User();
        }

        // 2. 如果能匹配，登录成功，创建会话
        HttpSession session = req.getSession(true);
        session.setAttribute("user",user);
        //当登录成功后，后端返回给前端时，需要将密码设置为空字符串(这样相对安全一些)
        user.setPassword("");
        return user;
    }

    @PostMapping("/register")
    @ResponseBody
    public Object register(String username,String password) {
        User user = null;
        try {
            user = new User();
            user.setUsername(username);
            user.setPassword(password);
            int ret = userMapper.insert(user);
            System.out.println("ret的值: "+ret);
            //返回数据给前端的时候希望不要将密码返回
            user.setPassword("");
        } catch (DuplicateKeyException e) {
            //这是由于用户名重复，导致注册失败(这里是由insert抛出的异常)
            //返回一个空对象
            user = new User();
            System.out.println("注册失败,当前用户名: " +username+" 已被注册");
        }
        return user;
    }

    @GetMapping("/userInfo")
    @ResponseBody
    public Object getUserInfo(HttpServletRequest req) {
        //1.先从请求中获取会话
        HttpSession session = req.getSession(false);
        if (session == null) {
            //会话不存在，用户尚未登录，此时返回一个空的对象即可
            System.out.println("[getUserInfo] 当前获取不到 session 对象");
            return new User();
        }
        //2.从会话中获取到之前保存的用户对象
        User user = (User) session.getAttribute("user");
        if (user == null) {
            System.out.println("[getUserInfo] 当前获取不到 user 对象");
            return new User();
        }
        user.setPassword("");
        return user;
    }



}
