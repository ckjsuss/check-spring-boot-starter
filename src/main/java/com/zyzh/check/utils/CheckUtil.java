package com.zyzh.check.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验工具类
 *
 * @Title: CheckUtil
 * @Description:
 * @author: Leo wey
 * @date: 2023/2/22 14:18
 * @Version: 1.0
 */
public class CheckUtil {
    private static final Logger logger = LoggerFactory.getLogger(CheckUtil.class);

    /**
     * 使用正则表达式判断是否是邮箱格式
     *
     * @param value
     * @return
     */
    public static Boolean isEmail(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            String regEx = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher((String) value);
            if (m.matches()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * 使用正则表达式判断是否是电话号码
     * @param value
     * @return
     */
    public static Boolean isTelephone(Object value) {
        final String MOBILE_RULE = "^1[3-9]\\d{9}$";
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            String regEx = MOBILE_RULE;
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher((String) value);
            if (m.matches()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
