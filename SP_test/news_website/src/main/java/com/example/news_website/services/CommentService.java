package com.example.news_website.services;

import com.example.news_website.models.Comment;
import com.example.news_website.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private  CommentRepository repository;



    public List<Comment> getCommentsByNewsId(Long newsId) {
        return repository.findByNewsId(newsId);
    }

    public Comment addComment(Comment comment) {
        return repository.save(comment);
    }
}