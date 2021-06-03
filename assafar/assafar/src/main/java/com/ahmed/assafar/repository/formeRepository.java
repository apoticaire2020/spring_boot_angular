package com.ahmed.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.assafar.domaine.Article;
import com.ahmed.assafar.domaine.Forme;

public class formeRepository {

	public interface formRepository extends JpaRepository<Forme,Long>{
}
}
