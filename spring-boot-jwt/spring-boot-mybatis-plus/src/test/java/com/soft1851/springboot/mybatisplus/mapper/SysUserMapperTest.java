package com.soft1851.springboot.mybatisplus.mapper;

import com.soft1851.springboot.mybatisplus.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mybatisplus.entity.UserRolePer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class SysUserMapperTest {
@Resource
private  SysUserMapper sysUserMapper;
    @Test
    void selectByUserId() {
        List<UserRolePer> sysUserMappers=sysUserMapper.selectByUserId("1");
        System.out.println(sysUserMappers);
    }
}