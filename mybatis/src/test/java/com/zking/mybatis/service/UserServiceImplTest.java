package com.zking.mybatis.service;

import com.zking.mybatis.model.TSysUser;

import org.junit.Test;


import javax.annotation.Resource;


/**
 * @author dong
 * @create 2019-12-0520:19
 */

public class UserServiceImplTest extends BaseTest {
    @Resource
    private  UserService userService;

    @Test
    public  void load(){
        TSysUser user=userService.load("zhangsan");
        System.out.println(user);
    }

}
