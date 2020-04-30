package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class SysPermissionMapperTest {
    @Resource
    private SysPermissionMapper mapper;

    @Test
    void getPermissionById() {
    }

    @Test
    void getParentPermission() {
        System.out.println(mapper.getParentPermission());
    }

    @Test
    void getPermissionByParentId() {
    }
}