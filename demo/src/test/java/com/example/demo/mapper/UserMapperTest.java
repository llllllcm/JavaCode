package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    void getUserById() {
        UserEntity user = userMapper.getUserById(2);
        System.out.println(user);
    }

    @Test
    void getAll() {
        List<UserEntity> list = userMapper.getAll();
        System.out.println(list.size());
    }

    @Test
    void getUserByUserName() {
        UserEntity user = userMapper.getUserByUserName("lisi");
        System.out.println(user);
    }

//    @Test
//    void login() {
//        String username = "admin";
//        String password = "' or 1='1";
//        UserEntity inputEntity = new UserEntity();
//        inputEntity.setPassword(password);
//        inputEntity.setUsername(username);
//        UserEntity user = userMapper.login(inputEntity);
//        System.out.println(user);
//    }

    @Test
    void getAllByIdOrder() {
        List<UserEntity> list = userMapper.getAllByIdOrder("desc");
        System.out.println(list);
    }
    @Transactional
    @Test
    void updatePassword() {
        int result = userMapper.updatePassword(1,"123456","1234567");
        System.out.println("修改: "+result);
    }
    @Transactional
    @Test
    void delById() {
        int id = 1;
        int result = userMapper.delById(id);
        System.out.println("删除结果: "+result);
    }

//    @Test
//    void addUser() {
//        UserEntity newUser = new UserEntity();
//        newUser.setUsername("zhangsan");
//        newUser.setPassword("123");
//        int result = userMapper.addUser(newUser);
//        System.out.println("增加结果: "+result);
//    }

    @Test
    void getListByName() {
        String name = "zhang";
        List<UserEntity> list = userMapper.getListByName(name);
        list.stream().forEach(System.out::println);
    }
}