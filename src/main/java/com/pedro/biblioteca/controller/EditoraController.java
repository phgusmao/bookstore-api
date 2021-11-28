package com.pedro.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.biblioteca.domain.Editora;
import com.pedro.biblioteca.repositories.EditoraRepository;

@RestController
public class EditoraController {
	
	@Autowired
	EditoraRepository editoraRepository;
	
	@GetMapping(value="/editoras")
	public List<Editora> listarTodas(){
		
		return editoraRepository.findAll();
		
	}

}
