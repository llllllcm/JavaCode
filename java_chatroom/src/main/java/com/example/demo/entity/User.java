package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String username = "";
    private String password = "";
}
