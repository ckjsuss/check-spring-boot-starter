package com.zyzh.check.annotation;

import java.lang.annotation.*;

/**
 * @author lw937
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DoChecks {
    DoCheck[] value();
}

