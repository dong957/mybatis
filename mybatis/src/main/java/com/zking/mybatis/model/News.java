package com.zking.mybatis.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * @author dong
 * @create 2019-11-2011:19
 */
@ToString
public class News {
    private Integer newsId;
    private String title;

    private List<Category> categorys;

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(newsId, news.newsId) &&
                Objects.equals(title, news.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, title);
    }
}
