package com.example.news_website.controllers;

import com.example.news_website.models.News;
import com.example.news_website.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService service;

    // List news under a category
    @GetMapping("/category/{id}")
    public String getNewsByCategory(@PathVariable Long id, Model model) {
        model.addAttribute("newsList", service.getNewsByCategory(id));
        return "news_list"; // JSP file
    }

    // Show news details
    @GetMapping("/view/{id}")
    public String getNewsById(@PathVariable Long id, Model model) {
        Optional<News> newsOptional = service.getNewsById(id);
        if (newsOptional.isPresent()) {
            model.addAttribute("news", newsOptional.get());
            return "news_details"; // JSP file
        } else {
            return "news_not_found"; // Optional: a simple error JSP
        }
    }
}
