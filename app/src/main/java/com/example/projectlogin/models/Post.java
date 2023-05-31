package com.example.projectlogin.models;

public class Post {
    private String documentid;
    private String title;
    private String contents;

    public Post() {
    }

    public Post(String documentid, String title, String contents) {
        this.documentid = documentid;
        this.title = title;
        this.contents = contents;
    }

    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
