package com.pedro.biblioteca.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Genero{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idGenero")
	private Integer id;
	private String nome;
	
	@OneToMany(mappedBy="genero", cascade = CascadeType.ALL)
	private List<Livro> livros = new ArrayList<>();

	public Genero() {
	}

	public Genero(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
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
		Genero other = (Genero) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
