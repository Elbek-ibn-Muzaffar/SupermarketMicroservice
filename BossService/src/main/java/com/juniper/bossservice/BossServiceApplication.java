package com.juniper.bossservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BossServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossServiceApplication.class, args);
    }

}
