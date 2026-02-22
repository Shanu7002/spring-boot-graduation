package com.ativ2.sistema_estudantes.model.dto;

import java.time.LocalDateTime;

public class InformationResponse {
    private String name;
    private String version;
    private LocalDateTime date;
    private String status;

    public InformationResponse() { }

    public InformationResponse(String name, String version, LocalDateTime date, String status) {
        this.name = name;
        this.version = version;
        this.date = date;
        this.status = status;
    }

    public String getName() { return name; }
    public InformationResponse setName(String name) { this.name = name; return this;}

    public String getVersion() { return version; }
    public InformationResponse setVersion(String version) { this.version = version; return this; }

    public LocalDateTime getDate() { return date; }
    public InformationResponse setDate(LocalDateTime date) { this.date = date; return this; }

    public String getStatus() { return status; }
    public InformationResponse setStatus(String status) { this.status = status; return this; }
}
