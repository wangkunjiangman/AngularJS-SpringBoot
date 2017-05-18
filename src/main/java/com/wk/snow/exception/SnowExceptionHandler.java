package com.wk.snow.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wk on 2017/5/13.
 */
@ControllerAdvice
public class SnowExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = SnowException.class)
    @ResponseBody
    public ErrorInfo<String> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ErrorInfo<String> errorInfo=new ErrorInfo<String>();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setUrl(req.getRequestURL().toString());
        errorInfo.setData("错错错!");
        errorInfo.setMessage(e.getMessage());
        return errorInfo;
    }
}
