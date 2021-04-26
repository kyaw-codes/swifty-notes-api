package com.monkey.demo.api;

import com.monkey.demo.entity.Note;
import com.monkey.demo.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/note")
public class NoteApi {

    private final NoteService service;

    public NoteApi(NoteService service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<Note> createNote(@RequestBody Note note) {
        Note newNote = service.createEntity(note);
        return new ResponseEntity(newNote, HttpStatus.CREATED);
    }
}
