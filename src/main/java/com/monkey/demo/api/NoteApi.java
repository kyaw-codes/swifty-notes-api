package com.monkey.demo.api;

import com.monkey.demo.entity.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v0/note")
public class NoteApi {

    @GetMapping
    List<Note> hello() {
        return List.of(
                new Note("Hello", LocalDateTime.now()),
                new Note("Hi", LocalDateTime.now()),
                new Note("How are you", LocalDateTime.now())
        );
    }
}
