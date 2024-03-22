package com.shruti.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class TaskManagementBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagementBackendApplication.class, args);
    }
}
