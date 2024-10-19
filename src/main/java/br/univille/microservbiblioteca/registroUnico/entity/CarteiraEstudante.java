package br.univille.microservbiblioteca.registroUnico.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class CarteiraEstudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private UUID id_usuario;
    private Date validade;

    @Enumerated(EnumType.STRING)
    private StatusEstoque status;

    private DateTime registro;

    public CarteiraEstudante() {}

    public CarteiraEstudante(UUID id_usuario, Date validade, StatusEstoque status) {
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

    public StatusEstoque getStatus() {
        return status;
    }

    public void setStatus(StatusEstoque status) {
        this.status = status;
    }

    public DateTime getRegistro() {
        return registro;
    }

}