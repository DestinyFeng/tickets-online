package com.woniu.jobs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import javax.annotation.Resource;

/**
 * 创建调度器工厂
 */
@Configuration
public class QuartzConfiguration {
    @Resource
    private SpringJobFactory jobFactory;
    @Bean
    public SchedulerFactoryBean schedulerFactory(){
        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();
        //用spring的job工厂替换原来的job工厂
        factoryBean.setJobFactory(jobFactory);
        return factoryBean;
    }
}
