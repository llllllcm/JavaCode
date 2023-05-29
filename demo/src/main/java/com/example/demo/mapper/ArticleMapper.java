package com.example.demo.mapper;

import com.example.demo.entity.ArticleInfo;
import com.example.demo.entity.vo.ArticleInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    //根据文章id查询文章详情
    ArticleInfoVO getDetail(@Param("id") Integer id);

    //根据作者id获取文章
    List<ArticleInfoVO> getListByUid(@Param("uid") Integer uid);

}
