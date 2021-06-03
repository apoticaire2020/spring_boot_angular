package com.ahmed.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.assafar.domaine.Fournisseur;

public class clientRepository {

	public interface ClientRepository extends JpaRepository<Fournisseur, Long>{
}
}
