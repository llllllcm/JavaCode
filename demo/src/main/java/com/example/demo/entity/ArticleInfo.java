package com.example.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleInfo {
    private int id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int uid;
    private int rcount;
    private int state;

}
