package com.zking.mybatis.service;

import com.zking.mybatis.mapper.NewMapper;
import com.zking.mybatis.model.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @create 2019-11-2011:42
 */
@Service
public class NewsServiceImpl implements  NewsService {
    @Resource
    private NewMapper newMapper;

    @Override
    public List<News> list(News news) {
        return newMapper.list(news);
    }
}
