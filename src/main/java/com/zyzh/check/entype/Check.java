package com.zyzh.check.entype;

import com.zyzh.check.utils.CheckUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

/**
 * @Title: Check
 * @Description:
 * @author: Leo wey
 * @date: 2023/2/22 14:17
 * @Version: 1.0
 */
/**
 * 校验枚举类
 * @author 单程车票
 */
public enum Check {

    Email("参数应为Email地址", CheckUtil::isEmail),

    Telephone("参数应为Email地址", CheckUtil::isTelephone);

    public String msg;

    /**
     * 函数式接口 Object为传入参数类型，Boolean为返回类型
     */
    public Function<Object, Boolean> function;

    Check(String msg, Function<Object, Boolean> function) {
        this.msg = msg;
        this.function = function;
    }
}