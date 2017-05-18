package com.wk.snow.util;

/**
 * Created by wk on 2017/5/18.
 */
public enum HttpCodeConstant {

    SUCCESS(20000,"请求成功")
    ,FAIL(30000,"请求失败")
    ,TROUBLE(40000,"请求失败");

    private String msg;
    private int code;

    HttpCodeConstant(int code,String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
