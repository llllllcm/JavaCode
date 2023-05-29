package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper//不能忽略
public interface UserMapper {
    //获取所有的用户信息
    List<UserEntity> getAll();

    //根据id降序的方式获取用户信息列表
    List<UserEntity> getAllByIdOrder(@Param("ord") String ord);

    // 根据id查询用户
    UserEntity getUserById(@Param("uid") Integer id);

    //根据username来查询用户
    UserEntity getUserByUserName(@Param("username") String username);

    //登录方法
    //由于这里传的是对象，于是注解@Param就省略了。
    UserEntity login(UserEntity user);

    //重置密码
    int updatePassword(@Param("id") Integer id,
                       @Param("password") String password,
                       @Param("newPassword") String newPassword);
    //删除用户
    int delById(@Param("id") Integer id);

    //添加用户
    int addUser(UserEntity newUser);

    //根据用户名进行模糊查询
    List<UserEntity> getListByName(@Param("username") String username);
}
