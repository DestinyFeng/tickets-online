package com.woniu.orders.entity;
import java.util.Date;


/**
 * @program: tickets-online
 * @description:
 * @author: liutao
 * @create: 2019-09-21 16:52
 **/
public class MovieShowInfo {
    private  String cName;
    private String rName;
    private Date playTime;
    private Double money;
    private  String formatTime;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
    }
}
