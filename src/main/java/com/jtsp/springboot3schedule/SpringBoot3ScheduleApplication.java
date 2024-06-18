package com.jtsp.springboot3schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot3ScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3ScheduleApplication.class, args);
    }



}
