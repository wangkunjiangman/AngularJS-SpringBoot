package com.wk.snow.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wk.snow.entity.User;
import com.wk.snow.exception.SnowException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wk on 2017/5/11.
 */
@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/helloWorld")
    public String helloError() throws Exception {
        throw new SnowException("bad Exception");
    }
}
