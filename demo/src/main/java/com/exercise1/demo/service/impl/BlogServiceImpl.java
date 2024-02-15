package com.exercise1.demo.service.impl;

import com.exercise1.demo.model.BlogModel;
import com.exercise1.demo.repository.BlogRepository;
import com.exercise1.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public ResponseEntity<List<BlogModel>> getAllBlogs() {
        return new ResponseEntity<List<BlogModel>>(blogRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<<BlogModel>> getBlog(Long id) {
        return new ResponseEntity<BlogModel>(blogRepository.findById(id), HttpStatus.Ok);
    }


}
