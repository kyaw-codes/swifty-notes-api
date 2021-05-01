package com.monkey.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class SwiftyNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwiftyNotesApplication.class, args);
    }

}
