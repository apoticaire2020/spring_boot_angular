package com.ahmed.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.assafar.domaine.Article;


@Repository
public interface articleRepository  extends JpaRepository<Article, Long>{
     
	
}
