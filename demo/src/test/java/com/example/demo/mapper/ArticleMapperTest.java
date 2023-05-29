package com.example.demo.mapper;

import com.example.demo.entity.vo.ArticleInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void getDetail() {
        ArticleInfoVO articleInfoVO = articleMapper.getDetail(1);
        System.out.println(articleInfoVO);
    }

    @Test
    void getListByUid() {
        Integer uid = 1;
        List<ArticleInfoVO> list = articleMapper.getListByUid(uid);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}