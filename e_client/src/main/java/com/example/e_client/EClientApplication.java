package com.example.e_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EClientApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    localhost启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }

}
