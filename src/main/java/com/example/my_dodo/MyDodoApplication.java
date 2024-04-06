package com.example.my_dodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients("com.example.my_dodo.microservices")
@EnableScheduling
public class MyDodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDodoApplication.class, args);
    }

}
