package com.wk.snow.service;

import com.wk.snow.entity.User;
import com.wk.snow.util.HttpResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wk on 2017/5/12.
 */
public interface UserService {
    /**
     * 批量获取用户
     * */
    List<User> getUserList();
    /**
     * 根据Id获取用户
     * */
    User getUserById(int userId);
    /**
     * 新增用户
     * */
    String insertUser(User user);
    /**
     * 根据id更新用户
     * */
    String updateUser(User user);
    /**
     * 根据id删除用户
     * */
    String deleteUser(int userId);

    /**
     * 根据登录名、密码判断是否成功
     * */
    HttpResult<Integer> login(User user);
}
