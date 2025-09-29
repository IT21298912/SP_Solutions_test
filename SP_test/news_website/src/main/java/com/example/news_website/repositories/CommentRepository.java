package com.example.news_website.repositories;

import com.example.news_website.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long newsId);
}