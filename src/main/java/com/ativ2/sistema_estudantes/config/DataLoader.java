package com.ativ2.sistema_estudantes.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ativ2.sistema_estudantes.model.Curso;
import com.ativ2.sistema_estudantes.model.Estudante;
import com.ativ2.sistema_estudantes.repository.CursoRepository;
import com.ativ2.sistema_estudantes.repository.EstudanteRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner{

    private final EstudanteRepository estudanteRepository;
    private final CursoRepository cursoRepository;

    @Override   
    public void run(String... args) {
        if (cursoRepository.count() == 0) {
            cursoRepository.save(new Curso(null, "Engenharia de Software"));
            cursoRepository.save(new Curso(null, "Engenharia de Computação"));
            cursoRepository.save(new Curso(null, "Análise e Desenvolvimento de Sistemas"));
            cursoRepository.save(new Curso(null, "Ciência da Computação"));
            cursoRepository.save(new Curso(null, "Sistemas de Informação"));
        }

        if (estudanteRepository.count() == 0) {
            Long engSoft = cursoRepository.findIdByName("Engenharia de Software");
            Long engComp = cursoRepository.findIdByName("Engenharia de Computação");
            Long ads = cursoRepository.findIdByName("Análise e Desenvolvimento de Sistemas");
            Long cc = cursoRepository.findIdByName("Ciência da Computação");
            Long si = cursoRepository.findIdByName("Sistemas de Informação");

            estudanteRepository.save(new Estudante("Ana Paula Ribeiro", "ana.ribeiro@email.com", engComp, "100"));
            estudanteRepository.save(new Estudante("Lucas Martins Silva", "lucas.silva@email.com", ads, "101"));
            estudanteRepository.save(new Estudante("Juliana Fernandes Costa", "juliana.costa@email.com", cc, "102"));
            estudanteRepository.save(new Estudante("Rafael Henrique Souza", "rafael.souza@email.com", si, "103"));
            estudanteRepository.save(new Estudante("Beatriz Almeida Santos", "beatriz.santos@email.com", engSoft, "104"));
        }
    }
}
