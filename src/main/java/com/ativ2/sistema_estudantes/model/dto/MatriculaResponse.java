package com.ativ2.sistema_estudantes.model.dto;

public class MatriculaResponse {
    private String matricula;
    private String name;
    private String curso;

    public MatriculaResponse() { }

    public MatriculaResponse(String matricula, String name, String curso) {
        this.matricula = matricula;
        this.name = name;
        this.curso = curso;
    }

    public String getMatricula() { return matricula; }
    public MatriculaResponse setMatricula(String matricula) { this.matricula = matricula; return this; }

    public String getName() { return name; }
    public MatriculaResponse setName(String name) { this.name = name; return this; }

    public String getCurso() { return curso; }
    public MatriculaResponse setCurso(String curso) { this.curso = curso; return this; }

}
