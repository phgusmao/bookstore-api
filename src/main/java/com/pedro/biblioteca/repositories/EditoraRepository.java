package com.pedro.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedro.biblioteca.domain.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer>{

}
