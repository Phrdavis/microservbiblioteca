package br.univille.microservbiblioteca.catalogo.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class RegistroEstoque{

    private UUID id;
    private UUID id_livro;
    private int quantidade;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public RegistroEstoque() {}

    public RegistroEstoque(UUID id_livro, int quantidade) {
        this.id_livro = id_livro;
        this.quantidade = quantidade;
    }

    public UUID getId() {
        return id;
    }

    public UUID getIdLivro() {
        return id_livro;
    }

    public void setIdLivro(UUID id_livro) {
        this.id_livro = id_livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

}