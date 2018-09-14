package com.claro.amx.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.claro.amx")
public class ServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class, args);
    }
}
