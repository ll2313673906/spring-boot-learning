package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * @Author F*WT
 * @Date 2020/4/9 13:54
 * @Description 自定义的Web日志注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    // 调用的接口名称
    String name();
    // 标识该日志是否需要持久化储存
    boolean isSaved() default false;
}
