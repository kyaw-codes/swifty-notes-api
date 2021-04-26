package com.monkey.demo.service;

import com.monkey.demo.entity.Note;
import com.monkey.demo.repo.NoteRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NoteService extends BaseServiceImpl<Note, NoteRepo> {

    private NoteRepo repo;

    public NoteService(NoteRepo repository) {
        super(repository);
        this.repo = repository;
    }

    @Override
    public Note createEntity(Note note) {
        note.setDate(LocalDateTime.now());
        return super.createEntity(note);
    }

    @Override
    public Note editEntity(Note note) {
        Note old = repo.findById(note.getId()).orElseThrow();
        old.setNote(note.getNote());
        old.setDate(LocalDateTime.now());
        return old;
    }
}
