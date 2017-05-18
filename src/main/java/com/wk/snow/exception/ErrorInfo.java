package com.wk.snow.exception;

/**
 * Created by wk on 2017/5/13.
 */
public class ErrorInfo<T> {
    public static final Integer OK = 20000;
    public static final Integer ERROR = 50401;
    private int code;
    private String message;
    private String url;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
}
