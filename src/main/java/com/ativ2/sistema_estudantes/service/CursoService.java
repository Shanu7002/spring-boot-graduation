package com.ativ2.sistema_estudantes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ativ2.sistema_estudantes.model.Curso;
import com.ativ2.sistema_estudantes.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {
    private final CursoRepository cursoRepository;

    public String[] getCursos() {
        List<Curso> cursos = cursoRepository.findAll();
        int size = cursos.size();

        String[] response = new String[size]; 

        for (int i = 0; i < size; i++) {
            response[i] = cursos.get(i).getNome();
        }

        return response;
    }

    public String getCursoById(Long id) {
        int size = cursoRepository.findAll().size();
        if (id > size || id < 0) {
            return "Invalid course. Try 1 - " + size;
        }
        return cursoRepository.findNomeById(id);
    }

    public boolean addCurso(String nome) {
        try {
            if (nome == null || nome.trim().isEmpty()) {
                return false;
            }

            Curso curso = new Curso();
            curso.setNome(nome);
            cursoRepository.save(curso);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
