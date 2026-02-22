package com.ativ2.sistema_estudantes.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ativ2.sistema_estudantes.repository.EstudanteRepository;
import com.ativ2.sistema_estudantes.model.Estudante;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner{

    private final EstudanteRepository estudanteRepository;

    @Override   
    public void run(String... args) {
        if (estudanteRepository.count() == 0) {
            estudanteRepository.save(new Estudante(1, "Eduardo Longen Correa", "eduardo.longen@email.com", "Engenharia de Software", "20222720"));
            estudanteRepository.save(new Estudante(2, "Maria Bordignon", "maria.bordignon@email.com", "Ciência da Computação", "2025002"));
            estudanteRepository.save(new Estudante(3, "Daemon Targaryen", "daemon@email.com", "Sistemas de Informação", "2025003"));
        }
    }
}
