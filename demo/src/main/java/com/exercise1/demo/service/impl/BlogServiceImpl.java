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
    public ResponseEntity<BlogModel> getBlog(Long id) {
        return new ResponseEntity<BlogModel>(blogRepository.findById(id).get(), HttpStatus.OK);
    }

    @Override
    public  ResponseEntity<Long> createBlog(BlogModel blog)
    {
        BlogModel blogModel = blogRepository.save(blog);
        return new ResponseEntity<Long>( blogModel.getId(), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> updateBlog(Long id,BlogModel blog)
    {
        BlogModel blogModel = blogRepository.findById(id).get();
        blogModel.setBlogTitle(blog.getBlogTitle());
        blogModel.setBlog_author((blog.getBlog_author()));
        blogModel.setBlog_content(blog.getBlog_content());
        blogRepository.save(blogModel);
        return new ResponseEntity<String>("Blog successfully updated!",HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteBlog(Long id) {
        blogRepository.deleteById(id);
        return new ResponseEntity<String>("Deleted Successfully.", HttpStatus.OK);
    }


}
