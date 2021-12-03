package com.pedro.biblioteca.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.biblioteca.domain.Editora;
import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.domain.Livro;
import com.pedro.biblioteca.repositories.EditoraRepository;
import com.pedro.biblioteca.repositories.GeneroRepository;
import com.pedro.biblioteca.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private GeneroRepository generoRepository;
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private EditoraRepository editoraRepository;

	public void instanciaBaseDeDados() {

		Genero gen1 = new Genero(null, "Fantasia");
		Genero gen2 = new Genero(null, "Romance");
		Genero gen3 = new Genero(null, "Informática");
		Genero gen4 = new Genero(null, "Ficção Científica");
		Genero gen5 = new Genero(null, "Terror");

		Editora edt1 = new Editora(null, "Rocco");
		Editora edt2 = new Editora(null, "Arqueiro");
		Editora edt3 = new Editora(null, "Aleph");

		Livro l1 = new Livro(null, "O nome do vento", "Patrick", "Cronicas do matador do rei", gen1, edt2, false);
		Livro l2 = new Livro(null, "Diário de Anne Frank", "Anne Frank", "2ª Guerra Mundial", gen2, edt3, false);
		Livro l3 = new Livro(null, "Clean Code", "Robert Cecil", "Programação", gen3, edt3, false);
		Livro l4 = new Livro(null, "Robot, I", "Isaac Asimov", "Robôs sentimentais", gen4, edt1, false);
		Livro l5 = new Livro(null, "Harry Potter", "JK Rowling", "História de um bruxo", gen1, edt1, false);

		gen1.getLivros().addAll(Arrays.asList(l1, l5));
		gen2.getLivros().addAll(Arrays.asList(l2));
		gen3.getLivros().addAll(Arrays.asList(l3));
		gen4.getLivros().addAll(Arrays.asList(l4));

		edt1.getLivros().addAll(Arrays.asList(l4, l5));
		edt2.getLivros().addAll(Arrays.asList(l1));
		edt3.getLivros().addAll(Arrays.asList(l2, l3));

		generoRepository.saveAll(Arrays.asList(gen1, gen2, gen3, gen4, gen5));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		editoraRepository.saveAll(Arrays.asList(edt1, edt2, edt3));
	}

}
