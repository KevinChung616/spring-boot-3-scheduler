package com.jtsp.springboot3schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTasks {
    // Task with fixed rate scheduling
    @Scheduled(fixedRate = 5000)
    public void fixedRateTask() {
        log.info("Fixed rate task, 5s - {}",  System.currentTimeMillis() / 1000);
    }

    // Task with fixed delay scheduling
    @Scheduled(fixedDelay = 7000)
    public void fixedDelayTask() {
        log.info("Fixed delay task, 7s - {}", System.currentTimeMillis() / 1000);
    }

    // Task with initial delay and fixed delay scheduling
    @Scheduled(initialDelay = 10000, fixedDelay = 7000)
    public void initialDelayTask() {
        log.info("Initial delay task -, init 10s, delay 7s {}", System.currentTimeMillis() / 1000);
    }

    // Task with cron expression scheduling
    @Scheduled(cron = "0 0/1 * * * ?")
    public void cronTask() {
        log.info("Cron task - every minute {}", System.currentTimeMillis() / 1000);
    }
}
