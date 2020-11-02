package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name="articles")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="description")
    private String description;

    @Column(name="title")
    private int title;

    @Column(name="author")
    private String author;

    @Column(name="url")
    private String url;

    public News()
    {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public News(long id, String description, int title, String author, String url) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.author = author;
        this.url = url;
    }
}

