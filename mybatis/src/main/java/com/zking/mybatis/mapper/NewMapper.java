package com.zking.mybatis.mapper;

import com.zking.mybatis.model.News;

import java.util.List;

/**
 * @author dong
 * @create 2019-11-2011:22
 */
public interface NewMapper {

    List<News> list(News news);

}
