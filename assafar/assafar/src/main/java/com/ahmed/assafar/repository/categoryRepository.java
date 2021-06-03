package com.ahmed.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.assafar.domaine.Article;
import com.ahmed.assafar.domaine.Categry;

public class categoryRepository {

	public interface catRepository extends JpaRepository<Categry,Long>{
}
}
