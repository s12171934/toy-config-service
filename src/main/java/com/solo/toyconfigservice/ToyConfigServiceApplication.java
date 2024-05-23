package com.solo.toyconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ToyConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToyConfigServiceApplication.class, args);
    }

}
