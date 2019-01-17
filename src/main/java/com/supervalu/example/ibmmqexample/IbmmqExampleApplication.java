package com.supervalu.example.ibmmqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IbmmqExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbmmqExampleApplication.class, args);
    }
}


