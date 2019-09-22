package com.woniu.jobs.job;


import com.sun.jmx.snmp.tasks.TaskServer;
import com.woniu.jobs.mapper.OrdersMapper;
import com.woniu.jobs.mapper.TasklistMapper;
import com.woniu.jobs.service.OrderService;
import com.woniu.jobs.service.TaskListService;
import com.woniu.jobs.util.DateUtil;
import org.ietf.jgss.Oid;
import org.quartz.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
@Scope("prototype")
public class ChangeOrderStatusJob implements Job {
    @Resource
    private OrderService orderService;
    @Resource
    private TaskListService taskListService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //接收创建任务时传入的参数
        String dataid =(String) jobExecutionContext.getMergedJobDataMap().get("orderid");

        try {
            orderService.updateOstate(dataid);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            //任务执行完毕 删除该任务
            jobExecutionContext.getScheduler().deleteJob(JobKey.jobKey("changeOrdersStatus"+dataid));
            taskListService.deleteById(dataid);
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
