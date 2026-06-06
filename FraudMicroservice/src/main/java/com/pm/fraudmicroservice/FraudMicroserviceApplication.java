package com.pm.fraudmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FraudMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FraudMicroserviceApplication.class, args);
    }

}
