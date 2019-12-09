package com.zking.mybatis.service;

import com.zking.mybatis.mapper.CategoryMapper;
import com.zking.mybatis.model.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-2012:01
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
     private CategoryMapper categoryMapper;


    @Override
    public List<Category> list(Category category) {
        return categoryMapper.list(category);
    }
}
