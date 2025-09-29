package com.example.news_website.models;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String readerName;

    @Column(length = 2000)
    private String message;

    @ManyToOne
    @JoinColumn(name = "news_id")
    @JsonBackReference  // avoid infinite recursion
    private News news;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}