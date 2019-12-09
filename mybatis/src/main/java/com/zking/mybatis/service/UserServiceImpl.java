package com.zking.mybatis.service;

import com.zking.mybatis.mapper.TUserMapper;
import com.zking.mybatis.model.TSysUser;
import org.apache.shiro.authz.Permission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author dong
 * @create 2019-12-0520:15
 */
@Service
public class UserServiceImpl implements UserService{


    @Resource
    private TUserMapper tUserMapper;


    @Override
    public TSysUser load(String username) {
        return tUserMapper.load(username);
    }

    @Override
    public Set<String> getRolesByUserName(String username) {
        return tUserMapper.getRolesByUserName(username);
    }

    @Override
    public Set<String> getPermissionsByUserName(String username) {
        return tUserMapper.getPermissionsByUserName(username);
    }
}
