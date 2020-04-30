package com.soft1851.springboot.mybatisplus.mapper;

import com.soft1851.springboot.mybatisplus.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mybatisplus.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class ArticleMapperTest {
@Resource
private ArticleMapper articleMapper;

    /**
     * 查询
     */
    @Test
    void selectAll() {
        List<Article> articles=articleMapper.selectList(null);
       articles.forEach(System.out::print);
    }

    /**
     * 根据id删除
     */
    @Test
    void  delectById(){

        System.out.println(articleMapper.deleteById(106));

    }

    /**
     * 增加
     */
    @Test
    void  insertArticle(){
        Article article=new Article();
        article.setTitle("测试");
        article.setLikes(5000);
        article.setSummary("测试总结 ");

        Date date=new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        article.setCreateTime(timestamp);
        int n=articleMapper.insert(article);
        System.out.println(n);
    }

    /**
     * 修改根据id
                                        *
     */
    @Test
    void updateById(){
            Article article=new Article();
            article.setId((long) 107);
            article.setTitle("ceshi");
            int n=articleMapper.updateById(article);
         System.out.println(n);

    }

}