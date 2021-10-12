package com.juniper.kassaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KassaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KassaServiceApplication.class, args);
    }

}
