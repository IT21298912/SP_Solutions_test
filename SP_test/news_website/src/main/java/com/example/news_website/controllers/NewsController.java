package com.example.news_website.controllers;

import com.example.news_website.models.News;
import com.example.news_website.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/news")
public class NewsController {
    @Autowired
    private  NewsService service;


    @GetMapping("/category/{id}")
    public List<News> getNewsByCategory(@PathVariable Long id) {
        return service.getNewsByCategory(id);
    }

    @GetMapping("/{id}")
    public Optional<News> getNewsById(@PathVariable Long id) {
        return service.getNewsById(id);
    }
}
