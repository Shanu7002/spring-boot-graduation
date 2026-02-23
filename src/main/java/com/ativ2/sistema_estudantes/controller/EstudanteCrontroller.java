package com.ativ2.sistema_estudantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ativ2.sistema_estudantes.model.dto.MatriculaResponse;
import com.ativ2.sistema_estudantes.service.EstudanteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EstudanteCrontroller {
    private final EstudanteService estudanteService;

    @GetMapping("/estudantes/{matricula}")
    public MatriculaResponse getEstudanteByMatricula(@PathVariable String matricula) {
        return estudanteService.getEstudanteByMatricula(matricula);
    }
}
