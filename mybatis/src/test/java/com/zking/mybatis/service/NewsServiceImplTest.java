package com.zking.mybatis.service;

import com.zking.mybatis.model.Category;
import com.zking.mybatis.model.News;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author dong
 * @create 2019-11-2011:45
 */

public class NewsServiceImplTest extends  BaseTest {

    @Resource
    private  NewsService newsService;


    @Test
    public void list() {

        News news=new News();
        List<News> ls=newsService.list(news);
        for(News n:ls){
            System.out.println("*****************");
            System.out.println(n);
            if(n.getCategorys()!=null) {
                for (Category c : n.getCategorys()) {
                    System.out.println(c);
                }
            }
        }
    }
}
