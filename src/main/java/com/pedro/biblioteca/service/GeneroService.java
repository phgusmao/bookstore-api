package com.pedro.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.biblioteca.domain.Genero;
import com.pedro.biblioteca.repositories.GeneroRepository;
import com.pedro.biblioteca.service.exceptions.ObjectNotFoundException;

@Service
public class GeneroService {
	
	@Autowired
	private GeneroRepository generoRepository;

	public Genero findById(Integer id) {
		Optional<Genero> obj = generoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Genero.class.getName()));
	}
	
	public List<Genero> findAll() {
		return generoRepository.findAll();
	}
}
