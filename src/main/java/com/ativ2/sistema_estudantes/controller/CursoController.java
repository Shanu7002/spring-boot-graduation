package com.ativ2.sistema_estudantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ativ2.sistema_estudantes.service.CursoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CursoController {
    private final CursoService cursoService;

    @GetMapping("/cursos")
    public String[] getCursos() {
        return cursoService.getCursos();
    }

    @GetMapping("/cursos/{id}")
    public String getCursoById(@PathVariable Long id) {
       return cursoService.getCursoById(id);
    }
}
