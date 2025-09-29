package com.example.news_website.services;


import com.example.news_website.models.Category;
import com.example.news_website.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private  CategoryRepository repository;



    public List<Category> getAllCategories() {
        return repository.findAll();
    }
}
