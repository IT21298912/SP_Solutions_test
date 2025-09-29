package com.example.news_website.services;


import com.example.news_website.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.news_website.models.News;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    private NewsRepository repository;



    public List<News> getNewsByCategory(Long categoryId) {
        return repository.findByCategoryId(categoryId);
    }

    public Optional<News> getNewsById(Long id) {
        return repository.findById(id);
    }
}