package com.vignnold.notekleme.model;

import org.springframework.stereotype.Repository;
import java.util.UUID;
@Repository

public class Note {
    private String id;
    private String title;
    private String content;

    public Note() {
        this.id = UUID.randomUUID().toString();
    }

    public Note(String id, String title, String content) {
        this();
        this.title = title;
        this.content = content;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
