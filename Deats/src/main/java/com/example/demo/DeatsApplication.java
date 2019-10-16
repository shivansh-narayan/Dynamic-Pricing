package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class DeatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeatsApplication.class, args);
        log.info("server start ho gya !");
    }

}
