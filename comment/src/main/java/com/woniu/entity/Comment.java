package com.woniu.entity;

import java.util.Date;

public class Comment {
    private Integer id;

    private String argue;

    private Byte userScore;

    private Integer mid;

    private Integer cid;

    private Date time;

    private Integer uid;
    private User user;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArgue() {
        return argue;
    }

    public void setArgue(String argue) {
        this.argue = argue == null ? null : argue.trim();
    }

    public Byte getUserScore() {
        return userScore;
    }

    public void setUserScore(Byte userScore) {
        this.userScore = userScore;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", argue='" + argue + '\'' +
                ", userScore=" + userScore +
                ", mid=" + mid +
                ", cid=" + cid +
                ", time=" + time +
                ", user=" + user +
                '}';
    }
}