package com.pedro.biblioteca.controller;

import java.util.List;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.dtos.GeneroDTO;
import com.pedro.biblioteca.service.GeneroService;

@RestController
@RequestMapping(value="/generos")
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	
	@GetMapping
	public ResponseEntity<List<GeneroDTO>> findAll(){
		List<Genero> list = generoService.findAll();
		List<GeneroDTO> listDTO = list.stream()
				.map(obj -> new GeneroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Genero> findById(@PathVariable Integer id) {
		Genero obj = generoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Genero> create(@RequestBody Genero obj){
		obj = generoService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/${id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<GeneroDTO> update(@PathVariable Integer id, @RequestBody GeneroDTO objDTO){
		Genero newObj = generoService.update(id, objDTO);
		return ResponseEntity.ok().body(new GeneroDTO(newObj));
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		generoService.delete(id);
		return ResponseEntity.noContent().build();
	}

}