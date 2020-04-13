package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author F*WT
 * @Date 2020/4/13 16:42
 * @Description
 */
@RestController
@Slf4j
public class UserController {
    /**
     * 无需任何校验，不用加注解
     * @param name
     * @return
     */
    @GetMapping("hello")

    public String hello(String name) {
        log.info("hello()方法无需鉴权，也无需认证，当前用户名:" + name);
        return "hello()方法访问";
    }

    /**
     * 需要登录的校验，此时该方法需要加注解，但是不需要传角色
     * @param name
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public String user(String name){
        log.info("user()方法需认证，当前用户名:" + name);
        return "user()方法访问成功";
    }

    @GetMapping("admin")
    @AuthToken(role_name = {"admin", "Admin"})
    public String admin(String name) {
        log.info("admin()方法需鉴权，当前用户名:" + name);
        return "admin()方法访问成功";
    }
}
