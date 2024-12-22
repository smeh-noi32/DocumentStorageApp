package org.vlad_developer.core;

import jakarta.persistence.Entity;

import java.io.File;
import java.sql.Timestamp;

@Entity
public class Document {

    private String name;

    private Timestamp date;

    private Profile author;

    private File file;

    private String description;

    public Document() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Profile getAuthor() {
        return author;
    }

    public void setAuthor(Profile author) {
        this.author = author;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
