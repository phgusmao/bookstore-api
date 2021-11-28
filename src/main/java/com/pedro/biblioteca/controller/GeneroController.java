package com.pedro.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.repositories.GeneroRepository;

@RestController
public class GeneroController {
	
	@Autowired
	GeneroRepository generoRepository;
	
	@GetMapping(value = "/generos")
	public List<Genero> listarTodos() {
		
		return generoRepository.findAll();
	}

}