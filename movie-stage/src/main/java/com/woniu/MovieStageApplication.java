package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.woniu.mapper")
public class MovieStageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieStageApplication.class, args);
    }

}
