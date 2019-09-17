package com.woniu.util;

import java.util.List;

public class Result{
    private String code;
    private String message;
    private Object object;
    private List list;

    public Result(){}
    public Result(String code, String message, Object object, List list) {
        this.code = code;
        this.message = message;
        this.object = object;
        this.list = list;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", object=" + object +
                ", list=" + list +
                '}';
    }
}
