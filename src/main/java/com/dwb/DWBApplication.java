package com.dwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.dwb.mappers") //扫描的mapper
@SpringBootApplication
@EnableScheduling
public class DWBApplication {

	public static void main(String[] args) {
		SpringApplication.run(DWBApplication.class, args);

	}
}
