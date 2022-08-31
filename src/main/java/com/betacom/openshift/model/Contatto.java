package com.betacom.openshift.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contatto implements Serializable {

	private static final long serialVersionUID = -2616826205630391848L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = true)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = true)
	private String username;
	
	public Contatto() {
		super();
	}

	public Contatto(String nome, String cognome, String username) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
