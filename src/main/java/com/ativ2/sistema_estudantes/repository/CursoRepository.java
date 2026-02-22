package com.ativ2.sistema_estudantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ativ2.sistema_estudantes.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    @Query("SELECT c.id FROM Curso c WHERE c.name = :name")
    Long findIdByName(@Param("name") String name);

    @Query("SELECT c.name FROM Curso c WHERE c.id = :id")
    String findNameById(@Param("id") Long id);
}
