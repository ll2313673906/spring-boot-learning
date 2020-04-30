package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.Map;


public interface SysRoleMapper {

    /**
     * 根据角色id查询角色
     * @param roleId
     * @return
     */
    @Select("SELECT * FROM sys_role WHERE role_id=#{roleId}")
    Map<String, Object> getRoleById(int roleId);
}
