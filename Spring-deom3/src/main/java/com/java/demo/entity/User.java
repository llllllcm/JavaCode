package com.java.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//使用lombok
@Setter
@Getter
@ToString
public class User {
    private int id;
    private String name;
}
