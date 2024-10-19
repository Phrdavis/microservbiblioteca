package br.univille.microservbiblioteca.registroUnico.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import br.univille.microservbiblioteca.domain.Status;

public class CarteiraEstudante {

    private UUID id;

    private UUID id_usuario;
    private Date validade;
    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public CarteiraEstudante() {}

    public CarteiraEstudante(UUID id_usuario, Date validade, Status status) {
        this.id_usuario = id_usuario;
        this.validade = validade;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public UUID getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(UUID id_usuario) {
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