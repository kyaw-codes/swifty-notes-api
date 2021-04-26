package com.monkey.demo.service;

import com.monkey.demo.entity.Note;
import com.monkey.demo.repo.NoteRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NoteService extends BaseServiceImpl<Note, NoteRepo> {

    public NoteService(NoteRepo repository) {
        super(repository);
    }

    @Override
    public Note createEntity(Note note) {
        note.setDate(LocalDateTime.now());
        return super.createEntity(note);
    }
}
