package com.zking.mybatis.controller;

import com.zking.mybatis.model.TSysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dong
 * @create 2019-12-0617:20
 */
@Controller

public class UserController {

    @RequestMapping("/logins")
    public String login(TSysUser user, Model model){
    Subject subject= SecurityUtils.getSubject();
    UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());
    try{
        subject.login(token);

    } catch (AuthenticationException ex){
        model.addAttribute("message","账户或密码错误!");
        return "logins";
    }
    return "a";
}


}