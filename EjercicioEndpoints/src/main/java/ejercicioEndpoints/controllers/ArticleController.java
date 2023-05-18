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

import ejercicioEndpoints.model.Article;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/article")
public class ArticleController {

	List<Article> articles = new ArrayList<Article>();

	@PostMapping("/createArticle")
	@Operation(summary = "Create Article")
	public ResponseEntity<Article> setArticle(Integer id, String title) {
		Article article = new Article();
		article.setId(id);
		article.setTitle(title);

		articles.add(article);

		return new ResponseEntity<>(article, HttpStatus.CREATED);
	}

	@GetMapping("/getArticleById")
	@Operation(summary = "Get Article")
	public ResponseEntity<Article> getArticleById(Integer id) {
		for (Article article : articles) {
			if (article.getId().equals(id)) {
				return new ResponseEntity<>(article, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/updateArticle")
	@Operation(summary = "Update Article")
	public ResponseEntity<Article> updateArticleById(Integer id_article, Integer new_id, String title, String content) {
		for (Article article : articles) {
			if (article.getId().equals(id_article)) {
				article.setId(new_id);
				article.setTitle(title);
				article.setContent(content);
				return new ResponseEntity<>(article, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/deleteArticle")
	@Operation(summary = "Delete Article")
	public ResponseEntity<Void> deleteArticleById(Integer id) {
		for (Article article : articles) {
			if (article.getId().equals(id)) {
				articles.remove(article);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
