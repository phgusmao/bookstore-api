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

import com.pedro.biblioteca.domain.Editora;
import com.pedro.biblioteca.repositories.EditoraRepository;

@RestController
@RequestMapping(value="/editoras")
public class EditoraController {
	
	@Autowired
	EditoraRepository editoraRepository;
	
	@GetMapping
	public List<Editora> listarEditoras(){
		return editoraRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Optional<Editora> listarEditoraId(@PathVariable("id") Integer idEditora){
		return editoraRepository.findById(idEditora);
	}
	
	@PostMapping
	public Editora inserirEditora(@RequestBody Editora editora) {
		return editoraRepository.save(editora);
	}
	
	@PutMapping
	public Editora editarEditora(@RequestBody Editora editora) {
		return editoraRepository.save(editora);
	}
	
	@DeleteMapping
	public void deletarEditora(@RequestBody Editora editora) {
		editoraRepository.delete(editora);
	}
	
	@DeleteMapping(value="/{id}")
	public void deletarEditoraId(@PathVariable("id") Integer idEditora) {
		editoraRepository.deleteById(idEditora);
	}

}
