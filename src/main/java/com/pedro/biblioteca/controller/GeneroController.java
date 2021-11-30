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

import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.repositories.GeneroRepository;

@RestController
@RequestMapping(value="/generos")
public class GeneroController {
	
	@Autowired
	GeneroRepository generoRepository;
	
	@GetMapping
	public List<Genero> listarGeneros() {	
		return generoRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<Genero> listarGeneroId(@PathVariable("id") Integer idGenero) {
		return generoRepository.findById(idGenero);
	}
	
	@PostMapping
	public Genero inserirGenero(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	
	@PutMapping
	public Genero editarGenero(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	
	@DeleteMapping
	public void deletarGenero(@RequestBody Genero genero) {
		generoRepository.delete(genero);
	}
	
	@DeleteMapping(value="/{id}")
	public void deletarGeneroId(@PathVariable Integer idGenero) {
		generoRepository.deleteById(idGenero);
	}

}