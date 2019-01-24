package com.yang.springboottest.util;

import java.io.Serializable;

/**
 * 无意义的测试类
 */
public class JsonResult{

    /*public static final int SUCCESS = 0;
    public static final int ERROR = 1;*/

    private int state = 200;
    /** 错误消息  */
    private String message = "zhang";
    /** 返回正确时候的数据 */
    private Object data = "data";

    public JsonResult() {
    }

  /*  public JsonResult(String error){
        state = ERROR;
        this.message = error;
    }

    public JsonResult(Object data){
        state = SUCCESS;
        this.data = data;
    }

    public JsonResult(Throwable e) {
        state = ERROR;
        message = e.getMessage();
    }

    public JsonResult(int state, Throwable e) {
        this.state = state;
        this.message = e.getMessage();
    }*/

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
    }

}