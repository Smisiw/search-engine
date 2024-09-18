package ru.nstu.searchengine.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Configuration
public class SchedulerConfig {

    @Bean
    public ExecutorService executorService(@Value("${app.core-pool-size:5}") int poolSize) {
        return new ScheduledThreadPoolExecutor(poolSize);
    }
}
