package br.univille.microservbiblioteca.logistica.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import br.univille.microservbiblioteca.catalogo.entity.Livro;

public class RegistroEmprestimo{

    private UUID id;
    private Livro id_livro;
    private UUID id_usuario;
    private Date inicio;
    private Date fim;
    private Date devolucao;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public RegistroEmprestimo() {}

    public RegistroEmprestimo(Livro id_livro, UUID id_usuario, Date inicio, Date fim, Date devolucao) {
        this.id_livro = id_livro;
        this.id_usuario = id_usuario;
        this.inicio = inicio;
        this.fim = fim;
        this.devolucao = devolucao;
    }

    public UUID getId() {
        return id;
    }

    public Livro getIdLivro() {
        return id_livro;
    }

    public void setIdLivro(Livro id_livro) {
        this.id_livro = id_livro;
    }

    public UUID getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(UUID id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

}