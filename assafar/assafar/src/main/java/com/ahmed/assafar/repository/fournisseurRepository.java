package com.ahmed.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.assafar.domaine.Article;
import com.ahmed.assafar.domaine.Fournisseur;

public class fournisseurRepository {

	public interface fournRepository extends JpaRepository<Fournisseur,Long>{
}
}
