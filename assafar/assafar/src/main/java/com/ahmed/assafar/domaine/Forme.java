package com.ahmed.assafar.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="forme")
@Setter @Getter
@ToString
@AllArgsConstructor
public class Forme {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String code;
	private String code_cat;
	private String libelle;
}
