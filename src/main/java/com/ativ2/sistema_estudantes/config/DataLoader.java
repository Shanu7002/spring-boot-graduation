package com.ativ2.sistema_estudantes.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ativ2.sistema_estudantes.model.Estudante;
import com.ativ2.sistema_estudantes.repository.EstudanteRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner{

    private final EstudanteRepository estudanteRepository;

    @Override   
    public void run(String... args) {
        if (estudanteRepository.count() == 0) {
            estudanteRepository.save(new Estudante(null, "Ana Paula Ribeiro", "ana.ribeiro@email.com", "Engenharia de Computação", "100"));
            estudanteRepository.save(new Estudante(null, "Lucas Martins Silva", "lucas.silva@email.com", "Análise e Desenvolvimento de Sistemas", "101"));
            estudanteRepository.save(new Estudante(null, "Juliana Fernandes Costa", "juliana.costa@email.com", "Ciência da Computação", "102"));
            estudanteRepository.save(new Estudante(null, "Rafael Henrique Souza", "rafael.souza@email.com", "Sistemas de Informação", "103"));
            estudanteRepository.save(new Estudante(null, "Beatriz Almeida Santos", "beatriz.santos@email.com", "Engenharia de Software", "104"));
        }
    }
}
