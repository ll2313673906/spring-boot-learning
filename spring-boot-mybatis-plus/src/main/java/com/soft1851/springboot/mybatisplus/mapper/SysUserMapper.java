package com.soft1851.springboot.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mybatisplus.entity.SysUser;
import com.soft1851.springboot.mybatisplus.entity.UserRolePer;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhent
 * @since 2020-04-16
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户id查询权限
     * @param id
     * @return
     */

    List<UserRolePer> selectByUserId(String id);

}
