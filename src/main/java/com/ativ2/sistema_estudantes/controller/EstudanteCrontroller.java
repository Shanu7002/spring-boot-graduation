package com.ativ2.sistema_estudantes.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ativ2.sistema_estudantes.model.dto.InformationResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EstudanteCrontroller {

    @GetMapping("/sistema/info")
    public InformationResponse getInformations() {
        return new InformationResponse("sistema_estudantes", System.getProperty("java.version"), LocalDateTime.now(), "Operacional.");
    }
}
