package com.soft1851.springboot.mybatisplus.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhent
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域主键
     */
    private Integer id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域上级标识
     */
    private Integer parentId;

    /**
     * 区域等级
     */
    private Integer level;

    /**
     * 区域编码
     */
    private String cityCode;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 组合名称
     */
    private String mergeName;


}
