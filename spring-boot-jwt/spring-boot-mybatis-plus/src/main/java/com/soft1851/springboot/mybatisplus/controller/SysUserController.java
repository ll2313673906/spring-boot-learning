package com.soft1851.springboot.mybatisplus.controller;


import com.soft1851.springboot.mybatisplus.entity.UserRolePer;
import com.soft1851.springboot.mybatisplus.mapper.SysUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hyj
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/api/")
public class SysUserController {
    @Resource
    private SysUserMapper userRoleDto;
    @GetMapping("id")
    public List<UserRolePer> rolePermission(String id) {
        return userRoleDto.selectByUserId(id);
    }
}
