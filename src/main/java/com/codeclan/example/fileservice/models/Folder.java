package com.codeclan.example.fileservice.models;

import java.util.List;

public class Folder {

    private long id;
    private String title;
    private List<File> files;
    private User user;

    public Folder(long id, String title, User user) {
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
