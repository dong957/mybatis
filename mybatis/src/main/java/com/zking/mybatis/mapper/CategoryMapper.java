package com.zking.mybatis.mapper;

import com.zking.mybatis.model.Category;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-2011:53
 */
public interface CategoryMapper {

    List<Category> list(Category category);
}
