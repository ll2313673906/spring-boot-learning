package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @Author F*WT
 * @Date 2020/4/13 16:43
 * @Description
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface AuthToken {
    /**
     * 访问接口所需要的省份 默认为空，即登录即可访问，可以定义多个
     * @return String[]
     */
    String[] role_name() default "";
}

