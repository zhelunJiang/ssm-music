package com.mine.music.utils;

public class WriteJson {
    private Integer error;
    private Object obj;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WriteJson(Object obj){
        if(obj!=null){
            this.obj = obj;
            this.error = 0;
            System.out.println("obj的类型为："+this.obj.getClass().getName());
        }else{
            this.error = 1;
            this.obj = null;
        }
    }
    public WriteJson(){

    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
