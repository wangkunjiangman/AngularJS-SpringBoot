package com.wk.snow.util;

import java.io.Serializable;

/**
 * Created by wk on 2017/5/18.
 */
public class HttpResult<T>  implements Serializable{

    private static final long serialVersionUID = -5756914211050798324L;

    private int flag;//状态码

    private String msg;//消息

    private T data;//返回数据

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
