package com.example.demo.entity.vo;

import com.example.demo.entity.ArticleInfo;
import lombok.Data;

@Data
public class ArticleInfoVO extends ArticleInfo {
    private String username;

    @Override
    public String toString() {
        return "ArticleInfoVO{" +
                "username='" + username + '\'' +
                "} " + super.toString();
    }
}
