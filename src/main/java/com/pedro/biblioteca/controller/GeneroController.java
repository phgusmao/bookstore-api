package com.pedro.biblioteca.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.dtos.GeneroDTO;
import com.pedro.biblioteca.repositories.GeneroRepository;
import com.pedro.biblioteca.service.GeneroService;

@RestController
@RequestMapping(value="/generos")
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	
	//@GetMapping
	//public List<Genero> listarGeneros() {	
	//	return generoRepository.findAll();
	//}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Genero> findById(@PathVariable Integer id) {
		Genero obj = generoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<GeneroDTO>> findAll() {
		List<Genero> list = generoService.findAll();
		List<GeneroDTO> listDTO = list.stream().map(obj -> new GeneroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}

}