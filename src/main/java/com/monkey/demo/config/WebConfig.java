package com.monkey.demo.config;

import com.monkey.demo.entity.Note;
import com.monkey.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class WebConfig {

    @Autowired
    private NoteService service;

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            List.of(
                    new Note("", LocalDateTime.now()),
                    new Note("", LocalDateTime.now()),
                    new Note("", LocalDateTime.now())
            ).forEach(note -> {
//                service.createNote(note);
            });
        };
    }
}
