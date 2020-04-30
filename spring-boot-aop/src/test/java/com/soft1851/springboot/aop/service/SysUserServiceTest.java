package com.soft1851.springboot.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class SysUserServiceTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    public void signIn() {
        System.out.println(sysUserService.signIn("2", "123456"));
    }
}