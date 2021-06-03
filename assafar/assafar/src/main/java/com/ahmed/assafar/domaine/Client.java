package com.ahmed.assafar.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter @Getter
@ToString
@AllArgsConstructor

public class Client {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String code;
	private String libelle;
	private String adress;
	private String tel;
	private float soldeInit;
	private float solde;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
