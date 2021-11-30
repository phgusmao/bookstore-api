package com.pedro.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Livro;
import com.pedro.biblioteca.repositories.LivroRepository;

@RestController
@RequestMapping(value="livros")
public class LivroController {

	@Autowired
	LivroRepository livroRepository;
	
	@GetMapping
	public List<Livro> listarLivros(){
		return livroRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<Livro> listarLivroId(@PathVariable("id") Integer idLivro){
		return livroRepository.findById(idLivro);
	}
	
	@PostMapping
	public Livro inserirLivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	
	@PutMapping
	public Livro alterarLivro(@RequestBody Livro livro) {
		return livroRepository.save(livro);
	}
	
	@DeleteMapping
	public void deletarLivro(@RequestBody Livro livro) {
		livroRepository.delete(livro);
	}
	
	@DeleteMapping(value="/{id}")
	public void deletarLivroId(@PathVariable("id") Integer idLivro) {
		livroRepository.deleteById(idLivro);
	}
	
}
