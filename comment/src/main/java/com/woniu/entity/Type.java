package com.woniu.entity;

public class Type {
    private Integer id;

    private String mtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype == null ? null : mtype.trim();
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", mtype='" + mtype + '\'' +
                '}';
    }
}