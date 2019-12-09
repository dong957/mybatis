package com.zking.mybatis.service;

import com.zking.mybatis.model.News;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-2011:42
 */
public interface NewsService {
    List<News> list(News news);
}
