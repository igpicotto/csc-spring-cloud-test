package com.claro.amx.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.claro.amx"})
@EnableCircuitBreaker
@ComponentScan("com.claro.amx")
public class ServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class, args);
    }
}
