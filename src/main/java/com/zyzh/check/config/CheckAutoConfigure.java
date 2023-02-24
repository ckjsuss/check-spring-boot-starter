package com.zyzh.check.config;

import com.zyzh.check.aop.DoCheckPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 * 注意@ConditionalOnProperty注解要放在后面两个注解的前面，这样才会优先通过配置文件判断是否要开启自动装配。
 * @Title: CheckAutoConfigure
 * @Description:
 * @author: Leo wey
 * @date: 2023/2/22 14:47
 * @Version: 1.0
 */

@Configuration

@ConditionalOnProperty(value = "check.enabled", havingValue = "true")
@ConditionalOnClass(CheckProperties.class)
@EnableConfigurationProperties(CheckProperties.class)
public class CheckAutoConfigure {

    /**
     * 使用配置Bean的方式使用DoCheckPoint切面
     */
    @Bean
    @ConditionalOnMissingBean
    public DoCheckPoint point() {
        return new DoCheckPoint();
    }

}