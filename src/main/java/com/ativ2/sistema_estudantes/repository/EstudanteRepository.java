package com.ativ2.sistema_estudantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ativ2.sistema_estudantes.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
}
