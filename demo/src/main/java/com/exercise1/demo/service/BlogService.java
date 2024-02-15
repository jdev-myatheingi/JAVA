package com.exercise1.demo.service;

import com.exercise1.demo.model.BlogModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BlogService {
    public ResponseEntity<List<BlogModel>> getAllBlogs();

    public ResponsEntity<BlogModel> getBlog(Long id);
}
