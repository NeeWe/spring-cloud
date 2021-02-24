package com.lemon.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClient.class, args);
    }
}
