package com.woniu.orders.util;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: tickets-online
 * @description:时间工具lei
 * @author: liutao
 * @create: 2019-09-15 13:43
 **/
public class DateUtil {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");

    //date 转字符串
    public static String dateToString(Date date) {
        return simpleDateFormat.format(date);
    }

    //判断周几
    public static String dayForWeek(Date date) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        String dayForWeek = null;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = "周日";
        } else {
            String day = null;
            if (c.get(Calendar.DAY_OF_WEEK) - 1 == 1) {
                day = "一";
            } else if (c.get(Calendar.DAY_OF_WEEK) - 1 == 2) {
                day = "二";
            } else if (c.get(Calendar.DAY_OF_WEEK) - 1 == 3) {
                day = "三";
            } else if (c.get(Calendar.DAY_OF_WEEK) - 1 == 4) {
                day = "四";
            } else if (c.get(Calendar.DAY_OF_WEEK) - 1 == 5) {
                day = "五";
            } else if (c.get(Calendar.DAY_OF_WEEK) - 1 == 6) {
                day = "六";
            }
            dayForWeek = "周" + day;
        }

        return dayForWeek;
    }

}

