package com.monkey.demo.config;

import com.monkey.demo.entity.Note;
import com.monkey.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class WebSecurityConfig {

    @Autowired
    private NoteService service;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            List.of(
                    new Note("Note 1", LocalDateTime.now()),
                    new Note("Note 2", LocalDateTime.now()),
                    new Note("Note 3", LocalDateTime.now())
            ).forEach(note -> {
                service.createEntity(note);
            });
        };
    }
}
