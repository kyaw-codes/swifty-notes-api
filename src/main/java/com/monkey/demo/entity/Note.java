package com.monkey.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Long id = 1L;

    @Column(name = "note_text")
    private String note;

    @Column(name = "last_updated_date")
    private LocalDateTime date;

    public Note() {
    }

    public Note(String note, LocalDateTime date) {
        this.note = note;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

//    The another possible way is you set the leading and top anchor or trailing and bottom anchor of the label first and then set the view's width, height, leading and top anchor equal to the label.