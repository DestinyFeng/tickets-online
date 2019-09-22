package com.woniu.jobs.listener;

import com.woniu.jobs.scheduler.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.annotation.Resource;

/**
 * 注册监听器
 */
@Configuration
public class QuartzListener implements ApplicationListener<ContextRefreshedEvent> {
    @Resource
    public JobScheduler jobScheduler;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try {
            jobScheduler.startScheduler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
