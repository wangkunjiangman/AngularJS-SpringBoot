package com.wk.test;

import com.wk.snow.controller.HelloWorldController;
import com.wk.snow.dao.UserMapper;
import com.wk.snow.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by wk on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SnowApplicationTests {
    @Autowired
    private UserMapper userMapper;

//    @Test
//    @Rollback
//    public void findByName() throws Exception {
//        User user=new User();
//        user.setId(1);
//        user.setName("wk");
//        user.setAge(20);
//        userMapper.insertUser(user);
//        User user1 = userMapper.getUserById(1);
//        Assert.assertEquals(20, user1.getAge());
//    }
}
