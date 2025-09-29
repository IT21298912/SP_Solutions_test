package com.example.news_website.controllers;

import com.example.news_website.models.Category;
import com.example.news_website.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
@Autowired
    private  CategoryService service;



    @GetMapping
    public List<Category> getAllCategories() {
        return service.getAllCategories();
    }
}