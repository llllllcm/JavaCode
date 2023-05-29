package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class UserEntity {
    private Integer id;
    private String username;
    private String pwd;
    private String photo;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer state;
}
