package com.zyzh.check.annotation;

import com.zyzh.check.entype.Check;

import java.lang.annotation.*;

/**
 *
 * @Title: DoCheck
 * @Description: 接口参数校验注解
 * @author: Leo wey
 * @date: 2023/2/22 14:15
 * @Version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DoChecks.class)
public @interface DoCheck {

    // 校验方式 （枚举）
    Check value() default Check.Email;
    // 校验参数
    String arg() default "";

    // 错误信息
    String msg() default "";
}
