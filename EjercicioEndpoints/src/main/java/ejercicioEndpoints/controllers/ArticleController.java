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

import ejercicioEndpoints.model.Article;

@RestController
@RequestMapping("/article")
public class ArticleController {
    
    @GetMapping("/getArticleById")
    public ResponseEntity<Article> getArticleById(@PathVariable Integer id) {
        Article article = new Article();
        article.setId(id);
        return ResponseEntity.ok(article);
    }
    
    @PostMapping("/createArticle")
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        return ResponseEntity.ok(article);
    }
    
    @PutMapping("/updateArticle")
    public ResponseEntity<Article> updateArticle(@PathVariable Integer id, @RequestBody Article article) {
    	article.setId(id);
        return ResponseEntity.ok(article);
    }
    
    @DeleteMapping("/deleteArticle")
    public ResponseEntity<Void> deleteArticle(@RequestBody Article article) {
        article.setTitle(null);
        article.setBlog(null);
        article.setContent(null);
        article.setId(null);
        article.setAbstracto(null);
        return ResponseEntity.noContent().build();
    }
    

}
