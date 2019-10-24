package com.example.e_cliend2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ECliend2Application {

    public static void main(String[] args) {

        SpringApplication.run(ECliend2Application.class, args);
    }

}
