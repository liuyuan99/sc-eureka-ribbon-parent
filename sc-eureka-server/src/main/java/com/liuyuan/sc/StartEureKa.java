package com.liuyuan.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartEureKa {
    public static void main(String[] args) {
        SpringApplication.run(StartEureKa.class);
    }
}
