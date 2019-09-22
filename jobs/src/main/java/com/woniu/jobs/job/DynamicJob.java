package com.woniu.jobs.job;


import com.woniu.jobs.entity.Tasklist;

import com.woniu.jobs.mapper.TasklistMapper;
import com.woniu.jobs.service.TaskListService;
import com.woniu.jobs.util.DateUtil;
import org.quartz.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 苟师傅
 */
@Component
public class DynamicJob implements Job {
    @Resource
    private TaskListService taskListService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("扫描任务表");
        List<Tasklist> list = null;
        try {
            list = taskListService.select("订单超时");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //每一批超时的订单  定义一个定时任务来处理
        Scheduler scheduler = jobExecutionContext.getScheduler();
        //传参
        for (Tasklist task : list) {
            System.out.println("有新的任务");
            Date tasktime = task.getTasktime();

            //定义修改订单状态的任务
            JobDetail baseJob = JobBuilder.newJob(ChangeOrderStatusJob.class).
                    withIdentity("changeOrdersStatus" + task.getTaskdataid()).build();
            //将数据传到目标任务中
            baseJob.getJobDataMap().put("orderid", task.getTaskdataid());
            //创建简单任务触发器  任务触发器决定了任务在什么时候执行
            SimpleScheduleBuilder simpleSchedulerBuilder = SimpleScheduleBuilder.simpleSchedule();
            SimpleTrigger simpleTrigger = TriggerBuilder.newTrigger().
                    startAt(new Date(tasktime.getTime()))
                    .withIdentity("baseJobTrigger"+task.getTaskdataid(), "baseTrigger")
                    .withSchedule(simpleSchedulerBuilder).build();
            try {
                //使用调度器管理该任务
                scheduler.scheduleJob(baseJob, simpleTrigger);

            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        }
    }
}
