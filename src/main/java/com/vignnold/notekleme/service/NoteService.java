package com.vignnold.notekleme.service;

import com.vignnold.notekleme.model.Note;
import com.vignnold.notekleme.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note getNoteById(String id) {
        return noteRepository.findById(id);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    public boolean deleteNoteById(String id) {
        return noteRepository.deleteById(id);
    }
}
