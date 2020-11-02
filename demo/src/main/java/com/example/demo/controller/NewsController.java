package com.example.demo.controller;
import com.example.demo.exception.RepoNotFound;
import com.example.demo.model.News;
import com.example.demo.repo.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/")
public class NewsController {

    @Autowired
    private NewsRepo newsRepo;

    @GetMapping("/authors")
    public List<News> getAllAuthors()
    {
        return newsRepo.findAll();
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<News> getAuthorById(@PathVariable Long id)
    {
        News news = newsRepo.findById(id).orElseThrow
                (()-> new RepoNotFound("Author does not exists with id: "+id));

      return ResponseEntity.ok(news);
     }







}
