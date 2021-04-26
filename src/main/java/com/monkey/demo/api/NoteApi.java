package com.monkey.demo.api;

import com.monkey.demo.entity.Note;
import com.monkey.demo.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    ResponseEntity<List<Note>> getAllNotes() {
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Note> getANote(@PathVariable long id) {
        return new ResponseEntity(service.findById(id), HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    void deleteNote(@PathVariable long id) {
        Note note = service.findById(id);
        service.deleteEntity(note);
    }

    @PatchMapping("/{id}")
    ResponseEntity<Note> editNote(@PathVariable long id, @RequestBody Note note) {
        note.setId(id);
        return new ResponseEntity(service.editEntity(note), HttpStatus.OK);
    }

}
