package com.wk;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.wk.snow.dao")
@EnableCaching
@EnableTransactionManagement
public class SnowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnowApplication.class, args);
	}
}
