package com.pedro.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Autor;
import com.pedro.biblioteca.repositories.AutorRepository;

@RestController
public class AutorController {
	
	@Autowired
	AutorRepository autorRepository;
	
	@GetMapping(value="/autores")
	public List<Autor> listarTodos(){
		
		return autorRepository.findAll();
		
	}
	
	@PostMapping(value="/autores")
	public Autor inserir(@RequestBody Autor autor){
		
		return autorRepository.save(autor);
		
	}
	
	

}
