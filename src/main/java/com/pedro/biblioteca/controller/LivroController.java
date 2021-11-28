package com.pedro.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Livro;
import com.pedro.biblioteca.repositories.LivroRepository;

@RestController
public class LivroController {

	@Autowired
	LivroRepository livroRepository;
	
	@GetMapping(value="/livros")
	public List<Livro> listarTodos(){
		
		return livroRepository.findAll();
		
	}
	
}
