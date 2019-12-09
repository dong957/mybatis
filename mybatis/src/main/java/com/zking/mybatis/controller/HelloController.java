package com.zking.mybatis.controller;

import org.springframework.stereotype.Controller;

/**
 * @author dong
 * @create 2019-11-2018:32
 */
@Controller

public class HelloController {
//方法一
//    @RequestMapping ("/index")
//    public String hello(String name){
//        System.out.println("Hello Spring Mvc");
//        return "index";
//    }




//方法二
  /*  @RequestMapping("/index")
  public String hello(String name){
        System.out.println("Hello Spring Mvc");
        return "forward:/WEN-INF/jsp/index.jsp";
    }
*/
//方法三

// @RequestMapping("/index")
//  public String hello(String name){
//        System.out.println("Hello Spring Mvc");
//        return "redirect:/ss";
//    }

//    @RequestMapping("ss")
//    public  String  ss(){
//     return "index";
//    }


}
