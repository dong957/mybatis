package com.zking.mybatis.model;

import lombok.ToString;

import java.util.Objects;

/**
 * @author dong
 * @create 2019-11-2011:40
 */
@ToString
public class NewsCategory {
    private Integer id;
    private Integer nid;
    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsCategory that = (NewsCategory) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nid, that.nid) &&
                Objects.equals(cid, that.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nid, cid);
    }
}
