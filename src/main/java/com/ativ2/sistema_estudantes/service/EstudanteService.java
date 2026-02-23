package com.ativ2.sistema_estudantes.service;

import org.springframework.stereotype.Service;

import com.ativ2.sistema_estudantes.model.dto.MatriculaResponse;
import com.ativ2.sistema_estudantes.repository.EstudanteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstudanteService {
    private final EstudanteRepository estudanteRepository;

    public MatriculaResponse getEstudanteByMatricula(String matricula) {
        return estudanteRepository.findEstudanteByMatricula(matricula);
    }
}
