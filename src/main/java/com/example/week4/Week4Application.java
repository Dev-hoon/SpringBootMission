package com.example.week4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Week4Application {

    public static void main(String[] args) {
        SpringApplication.run(Week4Application.class, args);
    }

}
