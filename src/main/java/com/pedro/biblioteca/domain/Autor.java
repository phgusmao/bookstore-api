package com.pedro.biblioteca.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAutor")
	private Integer id;
	private String nome;
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name="livro_id")
	private Livro livro;

	public Autor() {
		
	}
	
	public Autor(Integer id, String nome, String sexo) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, livro, nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(id, other.id) && Objects.equals(livro, other.livro) && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo);
	}
	
	
	
}
