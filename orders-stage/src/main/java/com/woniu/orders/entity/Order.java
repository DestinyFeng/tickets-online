package com.woniu.orders.entity;

import java.util.Date;
import java.util.List;


import com.woniu.orders.util.Seat;


public class Order {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 订单创建时间
     */
    private Date cTime;

    /**
     * 订单金额
     */
    private Double money;

    /**
     * 影院id
     */
    private Integer cid;

    /**
     * 订单状态，
     */
    private byte ostate;

    public String getOstateMsg() {
        return ostateMsg;
    }

    public void setOstateMsg(String ostateMsg) {
        this.ostateMsg = ostateMsg;
    }

    private String ostateMsg;

    /**
     * 支付状态,待支付，已支付，退款，
     */
    private Byte payState;

    /**
     * 支付方式
     */
    private Byte payway;

    /**
     * 二维码
     */
    private String code;

    /**
     * 订单号
     */
    private String orderId;
    //座位号
    private List<Seat> seatList;
    private String seat;
    //影院名
    private String cinemaName;
    //海报
    private String posterUrl;
    //影厅名
    private String roomName;
    //播放时间
    private Date palyTime;
    //电影名
    private String movieName;
    //影院地址
    private  String cinemaAddress;
    //电话
    private  String phone;

    public int  getLeftPaySecond() {
        return leftPaySecond;
    }

    public void setLeftPaySecond(int leftPaySecond) {
        this.leftPaySecond = leftPaySecond;
    }

    //剩余支付时间
    private int leftPaySecond;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public byte getOstate() {
        return ostate;
    }

    public void setOstate(Byte ostate) {
        this.ostate = ostate;
    }

    public Byte getPayState() {
        return payState;
    }

    public void setPayState(Byte payState) {
        this.payState = payState;
    }

    public Byte getPayway() {
        return payway;
    }

    public void setPayway(Byte payway) {
        this.payway = payway;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }


    public Date getPalyTime() {
        return palyTime;
    }

    public void setPalyTime(Date palyTime) {
        this.palyTime = palyTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }
    //格式化的播放时间
    private String formatTime;

    public String getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
    }
}