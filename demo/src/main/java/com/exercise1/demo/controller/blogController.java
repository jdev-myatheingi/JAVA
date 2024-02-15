package com.exercise1.demo.controller;

import com.exercise1.demo.model.BlogModel;
import com.exercise1.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class blogController
{
	@Autowired
	public BlogService blogService;

	@GetMapping("/blogs")
	public ResponseEntity<List<BlogModel>> getBlogs()
	{
		return blogService.getAllBlogs();
	}

	@GetMapping("/blogs/{id}")
	public ResponseEntity<BlogModel> getBlog(@PathVariable("id") Long id)
	{
		return blogService.getBlog(id);
	}

	@GetMapping("/put")
	public String putBlog()
	{
		return "put";
	}

	@GetMapping("/delete")
	public String deleteBlog()
	{
		return "delete";
	}
}
