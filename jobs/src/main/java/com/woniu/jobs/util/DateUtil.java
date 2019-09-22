package com.woniu.jobs.util;

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
    private static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //date 转字符串
    public static String dateToString(Date date) {
        return simpleDateFormat.format(date);
    }


    public static Date strToDate(String date) throws ParseException {
        return simpleDateFormat1.parse(date);
    }
    //得到日期
    public static  int dateToDay(Date date){
         String datestr = simpleDateFormat.format(date);
       return Integer.parseInt(datestr.split(" ")[0].split("-")[1]);
    }
    //得到日期的年月
    public static String yearMonth(Date date){
        String format = simpleDateFormat1.format(date);
        return format.substring(0,7);
    }
    //判断今天，明天还是周几
    public static String formatDate (Date date) throws ParseException {
        //得到日期

        //判断年月相等
       Date datenow = new Date();
      if (yearMonth(new Date()).equals(yearMonth(date))){

         if (DateUtil.dateToDay(date)==DateUtil.dateToDay(datenow)) {
            return "今天";
        } else if ((DateUtil.dateToDay(date)-DateUtil.dateToDay(datenow))==1) {
            return "明天";
        } else if ((DateUtil.dateToDay(date)-DateUtil.dateToDay(datenow))==2) {
            return "后天";
        }
      }
      return DateUtil.dayForWeek(date);



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

