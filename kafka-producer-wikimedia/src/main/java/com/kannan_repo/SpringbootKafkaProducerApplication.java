package com.kannan_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaProducerApplication implements CommandLineRunner {
    @Autowired
    private KafkaProducer wikimediaChangesProducer;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaProducerApplication.class);

        System.out.println("Hello world! from producer application");
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();

    }
}