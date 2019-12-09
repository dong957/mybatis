package com.zking.mybatis.service;

import com.zking.mybatis.model.TSysUser;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * @author dong
 * @create 2019-12-0520:16
 */
public interface UserService {

    TSysUser load(@Param("username") String username);

    /**
     *
     * @param username
     * @return
     */
    Set<String> getRolesByUserName(@Param("username") String username);





    Set<String> getPermissionsByUserName(@Param("username") String username);




}
