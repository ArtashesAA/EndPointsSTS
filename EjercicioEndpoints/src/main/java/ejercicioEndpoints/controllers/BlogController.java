package ejercicioEndpoints.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicioEndpoints.model.Blog;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/blog")
public class BlogController {

	List<Blog> blogs = new ArrayList<Blog>();

	@PostMapping("/createBlog")
	@Operation(summary = "Create Blog")
	public ResponseEntity<Blog> setBlog(Integer id, String title) {
		Blog blog = new Blog();
		blog.setId(id);
		blog.setTitle(title);

		blogs.add(blog);

		return new ResponseEntity<>(blog, HttpStatus.CREATED);
	}

	@GetMapping("/getBlogById")
	@Operation(summary = "Get Blog")
	public ResponseEntity<Blog> getBlogById(Integer id) {
		for (Blog blog : blogs) {
			if (blog.getId().equals(id)) {
				return new ResponseEntity<>(blog, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateBlog")
	@Operation(summary = "Update Blog")
	public ResponseEntity<Blog> updateBlogById(Integer id_blog, Integer new_id, String title, Integer anyo) {
		for (Blog blog : blogs) {
			if (blog.getId().equals(id_blog)) {
				blog.setId(new_id);
				blog.setTitle(title);
				blog.setAnyo(anyo);
				return new ResponseEntity<>(blog, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteBlog")
	@Operation(summary = "Delete Blog")
	public ResponseEntity<Void> deleteBlogById(Integer id) {
		for (Blog blog : blogs) {
			if (blog.getId().equals(id)) {
				blogs.remove(blog);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
