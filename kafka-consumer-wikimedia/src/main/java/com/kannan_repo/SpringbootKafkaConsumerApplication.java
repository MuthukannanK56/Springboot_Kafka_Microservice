package com.kannan_repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaConsumerApplication.class);

        System.out.println("Hello world! from producer application");
    }
}