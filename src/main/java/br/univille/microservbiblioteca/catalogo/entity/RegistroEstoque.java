package br.univille.microservbiblioteca.catalogo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroEstoque{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private UUID id_livro;
    private int quantidade;
    private DateTime registro;

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

    public DateTime getRegistro() {
        return registro;
    }

}