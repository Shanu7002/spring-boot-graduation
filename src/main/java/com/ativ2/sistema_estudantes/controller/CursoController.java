package com.ativ2.sistema_estudantes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ativ2.sistema_estudantes.model.dto.CursoResponse;

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

    @PostMapping("/cursos")
    public ResponseEntity<String> addCurso(@RequestBody CursoResponse cursoDTO) {
    boolean response = cursoService.addCurso(cursoDTO.getNome());

    if (response) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Curso adicionado com sucesso!");
    }

    return ResponseEntity
            .badRequest()
            .body("Erro ao adicionar curso.");
}
}
