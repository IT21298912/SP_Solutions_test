package com.example.news_website.controllers;

import com.example.news_website.models.Comment;
import com.example.news_website.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService service;

    // For JSON APIs
    @GetMapping("/news/{newsId}")
    @ResponseBody
    public List<Comment> getComments(@PathVariable Long newsId) {
        return service.getCommentsByNewsId(newsId);
    }

    @PostMapping
    @ResponseBody
    public Comment addComment(@RequestBody Comment comment) {
        return service.addComment(comment);
    }

    // For JSP page
    @GetMapping("/in")
    public String home() {
        return "index"; // will render /WEB-INF/jsp/index.jsp
    }
}
