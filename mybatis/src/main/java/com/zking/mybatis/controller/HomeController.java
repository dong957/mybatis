package com.zking.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dong
 * @create 2019-11-2414:01
 */
public class HomeController {

    @RequestMapping("/")
    public String goHome(){
        return  "index";
    }
}
