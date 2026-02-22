package com.ativ2.sistema_estudantes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 80)
    private String curso;

    @Column(nullable = false, unique = true, length = 20)
    private String matricula;

    public Estudante(String nome, String email, String curso, String matricula) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.matricula = matricula;
    }
}
