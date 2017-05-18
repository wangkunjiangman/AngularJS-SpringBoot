package com.wk.snow.service.base;

import com.wk.snow.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wk on 2017/5/12.
 */
public class BaseService {
    /**
     * 注入用户dao
     */
    @Autowired
    protected UserMapper userDao;

}
