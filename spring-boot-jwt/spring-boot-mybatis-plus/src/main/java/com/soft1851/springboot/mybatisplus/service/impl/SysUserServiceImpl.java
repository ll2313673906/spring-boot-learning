package com.soft1851.springboot.mybatisplus.service.impl;

import com.soft1851.springboot.mybatisplus.entity.SysUser;
import com.soft1851.springboot.mybatisplus.mapper.SysUserMapper;
import com.soft1851.springboot.mybatisplus.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhent
 * @since 2020-04-16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
