package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.woniu.orders.mapper")
@ImportResource("classpath:transaction.xml")

public class OrdersStageApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrdersStageApplication.class, args);
    }

}
