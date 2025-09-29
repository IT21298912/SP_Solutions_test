package com.example.news_website.repositories;


import com.example.news_website.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}