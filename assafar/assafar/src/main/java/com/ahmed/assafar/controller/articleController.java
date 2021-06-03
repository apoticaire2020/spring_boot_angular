package com.ahmed.assafar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.assafar.domaine.Article;
import com.ahmed.assafar.exception.ResourceNotFoundException;
import com.ahmed.assafar.repository.articleRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class articleController {

	@Autowired
	private articleRepository repository;
	
	@GetMapping("/articles")
	public List<Article> getAllArticles(){
        System.out.println("all article");
        
        List<Article> list = new ArrayList<Article>();
        repository.findAll().forEach(list::add);
       
       return list;
	}
	@GetMapping("/Articles/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable(value="id") Long articleid)
	  throws ResourceNotFoundException{
		Article article = repository.findById(articleid).orElseThrow(() -> new ResourceNotFoundException("zrticle not found for this id ::" + articleid ));
	    return ResponseEntity.ok().body(article);
	}
	@GetMapping("/Articles")
	public Article createArticle(@Validated @RequestBody Article article) {
		 return repository.save(article);
	}
	
}
