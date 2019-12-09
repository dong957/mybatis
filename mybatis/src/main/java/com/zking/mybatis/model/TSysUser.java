package com.zking.mybatis.model;

import java.util.Date;
import java.util.Objects;

/**
 * @author dong
 * @create 2019-12-0515:37
 */
public class TSysUser {
    private Integer userid;
    private String username;
    private String password;
    private String salt;
    private Date createdate;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSysUser tSysUser = (TSysUser) o;
        return Objects.equals(userid, tSysUser.userid) &&
                Objects.equals(username, tSysUser.username) &&
                Objects.equals(password, tSysUser.password) &&
                Objects.equals(salt, tSysUser.salt) &&
                Objects.equals(createdate, tSysUser.createdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username, password, salt, createdate);
    }
}
