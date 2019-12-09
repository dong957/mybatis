package com.zking.mybatis.service;

import com.zking.mybatis.model.Category;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-2012:00
 */
public interface CategoryService {

    List<Category> list(Category category);

}
