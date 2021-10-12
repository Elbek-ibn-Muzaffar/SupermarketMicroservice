package com.juniper.omorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OmorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmorServiceApplication.class, args);
    }

}
