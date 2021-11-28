package com.pedro.biblioteca.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Editora {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idEditora")
	private Long id;
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="livro_id")
	private Livro livro;
	
	public Editora() {
		
	}
	
	public Editora(Long id, String nome) {
		this.id= id;
		this.nome = nome;
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

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
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
		Editora other = (Editora) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
