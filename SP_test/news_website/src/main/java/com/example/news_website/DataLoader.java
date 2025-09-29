//package com.example.news_website;
//
//import com.example.news_website.models.Category;
//import com.example.news_website.models.News;
//import com.example.news_website.repositories.CategoryRepository;
//import com.example.news_website.repositories.NewsRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    private final CategoryRepository categoryRepository;
//    private final NewsRepository newsRepository;
//
//    public DataLoader(CategoryRepository categoryRepository, NewsRepository newsRepository) {
//        this.categoryRepository = categoryRepository;
//        this.newsRepository = newsRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        // ----- Categories -----
//        Category sports = new Category();
//        sports.setName("Sports");
//        categoryRepository.save(sports);
//
//        Category politics = new Category();
//        politics.setName("Politics");
//        categoryRepository.save(politics);
//
//        Category technology = new Category();
//        technology.setName("Technology");
//        categoryRepository.save(technology);
//
//        // ----- News -----
//        News news1 = new News();
//        news1.setTitle("Football World Cup Highlights");
//        news1.setContent("The Football World Cup 2025 saw some amazing matches...");
//        news1.setCategory(sports);
//        newsRepository.save(news1);
//
//        News news2 = new News();
//        news2.setTitle("Presidential Election Updates");
//        news2.setContent("The upcoming presidential election is heating up...");
//        news2.setCategory(politics);
//        newsRepository.save(news2);
//
//        News news3 = new News();
//        news3.setTitle("New Smartphone Launch");
//        news3.setContent("The latest smartphone has been launched with amazing features...");
//        news3.setCategory(technology);
//        newsRepository.save(news3);
//
//        News news4 = new News();
//        news4.setTitle("Basketball Championship");
//        news4.setContent("The national basketball championship finals concluded yesterday...");
//        news4.setCategory(sports);
//        newsRepository.save(news4);
//
//        System.out.println("Dummy data loaded successfully!");
//    }
//}