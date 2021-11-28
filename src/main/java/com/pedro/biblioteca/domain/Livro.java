package com.pedro.biblioteca.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idLivro")
	private Long id;
	private String nome;
	private String nome_autor;
	private String descricao;
	private Boolean aluguel;
	
	@ManyToOne
	@JoinColumn(name="genero_id")
	private Genero genero;

	public Livro() {
		
	}

	public Livro(Long id, String nome, String nome_autor, String descricao, Genero genero, Boolean aluguel) {
		this.id = id;
		this.nome = nome;
		this.nome_autor = nome_autor;
		this.descricao = descricao;
		this.genero = genero;
		this.aluguel = aluguel;
	}

	public Boolean getAluguel() {
		return aluguel;
	}

	public void setAluguel(Boolean aluguel) {
		this.aluguel = aluguel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
