package com.liuyuan.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@CrossOrigin
public class StartUserConsumer {
    public static void main(String[] args) {
        SpringApplication.run(StartUserConsumer.class);
    }
}
