package br.univille.microservbiblioteca.catalogo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private int codigo;
    private String nome;
    private String autor;
    private String editora;
    private String edicao;
    private String Genero;

    @Enumerated(EnumType.STRING)
    private StatusEstoque status;

    private DateTime registro;

    public Livro() {}

    public Livro(int codigo, String nome, String autor, String editora, String edicao, String Genero, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.Genero = Genero;
        this.status = status;
    }
    
    public UUID getId() {
        return id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getGenero() {
        return Genero;
    }
    
    public void setGenero(String Genero) {
        this.Genero = Genero;
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