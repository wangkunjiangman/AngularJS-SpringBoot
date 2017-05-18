package com.wk.test;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.wk.snow.controller.HelloWorldController;
import com.wk.snow.controller.UserController;
import com.wk.snow.entity.User;
import com.wk.snow.service.UserService;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by wk on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserApplicationTests {
    @Autowired
    private CacheManager cacheManager;
    @Autowired
    private UserService userService;
//    @Before
//    public void setUp(){
//        User user=new User();
//        user.setId(1);
//        user.setName("wk");
//        user.setAge(18);
//        userService.insertUser(user);
//    }
//    @Test
//    public void getHello() throws Exception {
//        User user1=userService.getUserById(1);
//        System.out.println("第一次查询："+user1.getAge());
//        User user2=userService.getUserById(1);
//        System.out.println("第二次查询："+user2.getAge());
//        User user=new User();
//        user.setId(1);
//        user.setName("wk");
//        user.setAge(16);
//        userService.updateUser(user);
//        User user3=userService.getUserById(1);
//        System.out.println("第三次查询："+user3.getAge());
//    }
}
