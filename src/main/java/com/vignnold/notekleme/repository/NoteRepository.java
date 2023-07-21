package com.vignnold.notekleme.repository;

import com.vignnold.notekleme.model.Note;
import lombok.Builder;
import lombok.Data;


import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
@Builder
@Repository
public class NoteRepository {

        private Map<String, Note> noteMap = new HashMap<>();

        public Note findById(String id) {
            return noteMap.get(id);
        }

        public List<Note> findAll() {
            return new ArrayList<>(noteMap.values());
        }

        public Note save(Note note) {
            noteMap.put(note.getId(), note);
            return note;
        }

        public boolean deleteById(String id) {
            return noteMap.remove(id) != null;
        }
    }









