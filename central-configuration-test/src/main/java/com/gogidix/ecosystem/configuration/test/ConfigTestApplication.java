package com.gogidix.ecosystem.configuration.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigTestApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigTestApplication.class, args);
    }
    
    @GetMapping("/health")
    public String health() {
        return "Central Configuration Test - Running Successfully";
    }
    
    @GetMapping("/config/test")
    public String configTest() {
        return "Enterprise Configuration Management - Operational";
    }
}
