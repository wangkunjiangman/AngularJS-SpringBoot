package com.wk.snow.controller;

import com.wk.snow.controller.base.BaseController;
import com.wk.snow.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wk on 2017/5/15.
 */
@RestController
public class LogingResetController extends BaseController{

    @PostMapping(value = "loginForm")
    public Object loginForm(@RequestBody User user){
        return userService.login(user);
    }
}
