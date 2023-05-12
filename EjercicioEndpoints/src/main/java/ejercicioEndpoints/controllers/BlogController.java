package ejercicioEndpoints.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicioEndpoints.model.Blog;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@GetMapping("/getBlogById")
    public ResponseEntity<Blog> getBlogById(@PathVariable Integer id) {
        Blog Blog = new Blog();
        Blog.setId(id);
        return ResponseEntity.ok(Blog);
    }
    
    @PostMapping("/createBlog")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog Blog) {
        return ResponseEntity.ok(Blog);
    }
    
    @PutMapping("/updateBlog")
    public ResponseEntity<Blog> updateBlog(@PathVariable Integer id, @RequestBody Blog Blog) {
    	Blog.setId(id);
        return ResponseEntity.ok(Blog);
    }
    
    @DeleteMapping("/deleteBlog")
    public ResponseEntity<Void> deleteBlog(@RequestBody Blog Blog) {
        Blog.setTitle(null);
        Blog.setUser(null);
        Blog.setId(null);
        Blog.setDate(null);
        return ResponseEntity.noContent().build();
    }
}
