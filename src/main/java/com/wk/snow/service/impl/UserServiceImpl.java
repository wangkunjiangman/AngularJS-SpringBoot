package com.wk.snow.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.wk.snow.entity.User;
import com.wk.snow.service.UserService;
import com.wk.snow.service.base.BaseService;
import com.wk.snow.util.HttpCodeConstant;
import com.wk.snow.util.HttpResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by wk on 2017/5/12.
 */
@Service

public class UserServiceImpl extends BaseService implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
//    @Override
//    public List<User> getUserList() {
//        return userDao.getUserList();
//    }
//

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        LOGGER.info("getUserById success! user:'{}'", userId);
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public String insertUser(User user) {
        return null;
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(int userId) {
        return null;
    }

    @Override
    public HttpResult<Integer> login(User user) {
        HttpResult<Integer> result = new HttpResult<Integer>();
        int resultNum = userDao.login(user);
        if (resultNum == 1) {
            result.setFlag(HttpCodeConstant.SUCCESS.getCode());
            result.setMsg(HttpCodeConstant.SUCCESS.getMsg());
            result.setData(1);
        } else {
            result.setFlag(HttpCodeConstant.TROUBLE.getCode());
            result.setMsg(HttpCodeConstant.TROUBLE.getMsg());
            result.setData(0);
        }
        return result;
    }
//
//    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
//    @Override
//    public String insertUser(User user) {
//        return userDao.insertUser(user) >= 1 ? "success" : "error";
//    }
//
//    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
//    @Override
//    public String updateUser(User user) {
//        int userId=userDao.updateUser(user);
//        return  userId !=0 ? "success:"+userId: "error:"+userId;
//    }
//
//    @Override
//    public String deleteUser(int userId) {
//        return userDao.deleteUser(userId) >= 1 ? "success" : "error";
//    }
}
