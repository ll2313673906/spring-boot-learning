package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


public interface RolePermissionMapper {

    /**
     * 根据角色id查询角色
     * @param id
     * @return
     */
    @Select("SELECT * FROM role_permission WHERE role_id=#{id}")
    List<Map<String, Object>> getRoleById(int id);
}
