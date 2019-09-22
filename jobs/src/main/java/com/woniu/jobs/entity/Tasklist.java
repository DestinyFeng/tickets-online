package com.woniu.jobs.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Tasklist {
    /**
    * 设置定时的任务在列表中的id
    */
    private Integer taskid;

    /**
    * 任务的目的（即任务名）
    */
    private String taskname;

    private String taskdesc;

    /**
    * 任务信息
    */
    private String taskmessage;

    /**
    * 与任务相关的数据的id
    */
    private String taskdataid;

    /**
    * 任务执行的时间
    */
    private Date tasktime;
}