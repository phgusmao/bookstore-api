package com.pedro.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedro.biblioteca.domain.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
