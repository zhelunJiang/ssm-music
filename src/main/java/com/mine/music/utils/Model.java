package com.mine.music.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.List;
import java.util.Map;

public class Model<T> {
    private String msg;
    private int code = 0;
    private Object obj;
    private List<T> list;
    private T entity;

    public  void write(){

    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
