package com.ativ2.sistema_estudantes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ativ2.sistema_estudantes.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
    Optional<Estudante> findByEmail(String email);
    
    Optional<Estudante> findByMatricula(String matricula);
}
