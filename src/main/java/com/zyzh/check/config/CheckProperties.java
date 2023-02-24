package com.zyzh.check.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取配置文件的信息类
 *
 * @Title: CheckProperties
 * @Description:
 * @author: Leo wey
 * @date: 2023/2/22 14:49
 * @Version: 1.0
 */
@ConfigurationProperties("check")
public class CheckProperties {
    /**
     * 默认为true，表示开启校验
     */
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}