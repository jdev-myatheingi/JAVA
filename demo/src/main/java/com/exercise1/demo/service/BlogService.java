package com.exercise1.demo.service;

import com.exercise1.demo.model.BlogModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BlogService {
    public ResponseEntity<List<BlogModel>> getAllBlogs();

    public ResponseEntity<BlogModel> getBlog(Long id);

    public ResponseEntity<Long> createBlog(BlogModel blog);

    public ResponseEntity<String> updateBlog(Long id,BlogModel blog);

    public ResponseEntity<String> deleteBlog(Long id);

}
