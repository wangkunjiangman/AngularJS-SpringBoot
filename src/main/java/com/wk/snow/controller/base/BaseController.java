package com.wk.snow.controller.base;

import com.wk.snow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wk on 2017/5/12.
 */
public class BaseController {
    /**
     * 用户service
     * */
    @Autowired
    protected UserService userService;
}
