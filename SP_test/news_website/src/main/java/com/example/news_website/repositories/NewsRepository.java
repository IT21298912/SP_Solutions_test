package com.example.news_website.repositories;

import com.example.news_website.models.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByCategoryId(Long categoryId);
}