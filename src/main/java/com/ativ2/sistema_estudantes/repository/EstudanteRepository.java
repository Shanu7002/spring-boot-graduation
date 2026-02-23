package com.ativ2.sistema_estudantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ativ2.sistema_estudantes.model.Estudante;
import com.ativ2.sistema_estudantes.model.dto.MatriculaResponse;

public interface EstudanteRepository extends JpaRepository<Estudante, Long>{
    @Query("""
            SELECT new com.ativ2.sistema_estudantes.model.dto.MatriculaResponse(
                e.matricula,
                e.nome,
                c.nome
            )
            FROM Estudante e
            LEFT JOIN e.curso c
            WHERE e.matricula = :matricula
            """)
    MatriculaResponse findEstudanteByMatricula(@Param("matricula") String matricula);
}
