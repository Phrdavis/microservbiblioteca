package br.univille.microservbiblioteca.registroUnico.entity;

import java.sql.Date;
import java.time.LocalDateTime;


import org.springframework.format.annotation.DateTimeFormat;

import br.univille.microservbiblioteca.domain.Status;

public class CarteiraEstudante {

    private String id;

    private String id_usuario;
    private Date validade;
    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public CarteiraEstudante() {}

    public CarteiraEstudante(String id_usuario, Date validade, Status status) {
        this.id_usuario = id_usuario;
        this.validade = validade;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

}