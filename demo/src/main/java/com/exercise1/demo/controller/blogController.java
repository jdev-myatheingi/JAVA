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

	@GetMapping("/blogs/get_all")
	public ResponseEntity<List<BlogModel>> getBlogs()
	{
		return blogService.getAllBlogs();
	}

	@GetMapping("/blogs/get/{id}")
	public ResponseEntity<BlogModel> getBlog(@PathVariable("id") Long id)
	{
		return blogService.getBlog(id);
	}

	@PostMapping("/blogs/create")
	public ResponseEntity<Long> createBlog(@RequestBody BlogModel blog)
	{
		return blogService.createBlog(blog);
	}

	@PutMapping("/blogs/update/{id}")
	public ResponseEntity<String> updateBlog(@PathVariable("id") Long id, @RequestBody BlogModel blog)
	{
		return  blogService.updateBlog(id,blog);
	}

	@DeleteMapping("/blogs/delete/{id}")
	public ResponseEntity<String> deleteBlog(@PathVariable("id") Long id)
	{
		return blogService.deleteBlog(id);
	}
}
