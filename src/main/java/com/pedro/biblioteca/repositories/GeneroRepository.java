package com.pedro.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedro.biblioteca.domain.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{
	
}
