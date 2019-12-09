package com.zking.mybatis.service;

import com.zking.mybatis.model.Category;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-2012:03
 */

public class CategoryServiceImplTest extends  BaseTest {



    @Resource
    private  CategoryService  categoryService;


    @Test
    public void list() {

        Category category=new Category();
        List<Category> ls=categoryService.list(category);
        for(Category c:ls){
            System.out.println("*****************");
            System.out.println(c);
//            for(Category c:c.getCategorys()){
//                System.out.println(c);
//            }
        }
    }
}
