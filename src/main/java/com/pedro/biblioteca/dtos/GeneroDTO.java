package com.pedro.biblioteca.dtos;

import java.io.Serializable;

import com.pedro.biblioteca.domain.Genero;

public class GeneroDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public GeneroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneroDTO(Genero obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
