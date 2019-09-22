package com.woniu.jobs.scheduler;

import com.woniu.jobs.job.DynamicJob;
import org.quartz.*;
import org.springframework.jca.work.SimpleTaskWorkManager;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 自定义任务调度器 用于手动的进行任务调度
 */
@Component
public class JobScheduler {
    @Resource
    private SchedulerFactoryBean factoryBean;
    //定义一个调度器
    private Scheduler scheduler;
    public void startScheduler() throws Exception{
        //使用调度器工厂获取一个调度器
        scheduler=factoryBean.getScheduler();
        //开启一个任务调度
        startJob();
    }
    //编写一个方法 来完成一个任务调度
    public void startJob() throws Exception{
        //将任务加入到调度器中Cron任务触发器
        JobDetail jobDetail = JobBuilder.newJob(DynamicJob.class)
                .withIdentity("cronJob", "cron").build();
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder
                .cronSchedule("0/10 * * * * ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger()
                .withIdentity("cronJobTrigger", "cron")
               .withSchedule(scheduleBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }
}
