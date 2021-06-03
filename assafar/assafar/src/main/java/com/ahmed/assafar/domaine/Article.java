package com.ahmed.assafar.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="article")
@Setter @Getter
@ToString
@AllArgsConstructor
public class Article {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String code;
	private String libelle;
	private float pph;
	private float ppv;
	private int stockInit;
	private int stock;
	
}
