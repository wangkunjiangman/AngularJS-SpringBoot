package com.wk.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by wk on 2017/5/14.
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
