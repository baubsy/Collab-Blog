package org.launchcode.blog.Blogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@GetMapping("/blogs")
	public List<Blog> getAllBlogs(){
		return blogRepository.findAll();
	}
	
}
