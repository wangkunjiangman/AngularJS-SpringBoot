package com.wk.snow.controller;

import com.wk.snow.controller.base.BaseController;
import com.wk.snow.entity.User;
import com.wk.snow.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by wk on 2017/5/11.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController{
    private static Map<Integer,User> userMap= Collections.synchronizedMap(new HashMap<Integer,User>());

    @ApiOperation(value = "获取用户列表",notes = "")
    @GetMapping(value = "")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @ApiOperation(value = "创建用户",notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping(value="")
    public String postUser(@ModelAttribute User user){
        return userService.insertUser(user);
    }

    @ApiOperation(value = "根据id获取用户",notes = "")
    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        return userService.getUserById(userId);
    }

    @ApiOperation(value = "根据id更新用户",notes = "")
    @PutMapping(value = "")
    public String putUser(@ModelAttribute User user){
        return userService.updateUser(user);
    }

    @ApiOperation(value = "根据id删除用户",notes = "")
    @DeleteMapping(value = "/{userId}")
    public String deleteUser(@PathVariable("userId")int userId){
        return userService.deleteUser(userId);
    }
}
