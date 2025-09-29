package com.example.news_website.controllers;

import com.example.news_website.models.Comment;
import com.example.news_website.models.News;
import com.example.news_website.services.CommentService;
import com.example.news_website.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private NewsService newsService;

    // Show comments for a news item and form to add comment
    @GetMapping("/news/{newsId}")
    public String showComments(@PathVariable Long newsId, Model model) {
        List<Comment> comments = commentService.getCommentsByNewsId(newsId);
        model.addAttribute("comments", comments);
        model.addAttribute("newsId", newsId);
        model.addAttribute("comment", new Comment()); // for form binding
        return "news_comments"; // JSP page
    }

    // Handle form submission
    @PostMapping("/news/{newsId}/add")
    public String addComment(@PathVariable Long newsId, @ModelAttribute Comment comment) {
        // Attach the news object to the comment
        News news = newsService.getNewsById(newsId).orElse(null);
        if (news != null) {
            comment.setNews(news);
            commentService.addComment(comment);
        }
        return "redirect:/comments/news/" + newsId; // reload page
    }
    @PostMapping("/add")
    public String addComment(@ModelAttribute Comment comment, @RequestParam Long newsId) {
        News news = newsService.getNewsById(newsId).orElse(null);
        if (news != null) {
            comment.setNews(news);
            commentService.addComment(comment);
        }
        return "redirect:/news/view/" + newsId;
    }

}
