package com.example.news_website.controllers;

import com.example.news_website.models.Category;
import com.example.news_website.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public String showCategories(Model model) {
        List<Category> categories = service.getAllCategories();
        model.addAttribute("categories", categories); // Now works correctly
        return "categories"; // JSP file: categories.jsp
    }
}
