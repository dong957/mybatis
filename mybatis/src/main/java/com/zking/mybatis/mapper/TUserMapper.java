package com.zking.mybatis.mapper;

import com.zking.mybatis.model.TSysUser;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

/**
 * @author dong
 * @create 2019-12-0518:04
 */
public interface TUserMapper {
    /**
     * 通过用户名称获取用户信息
     * @param username
     * @return
     */
    TSysUser load(@Param("username") String username);


    /**
     *
     * @param username
     * @return
     */
    Set<String> getRolesByUserName(@Param("username") String username);





    Set<String> getPermissionsByUserName(@Param("username") String username);


}
