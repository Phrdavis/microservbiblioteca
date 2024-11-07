package br.univille.microservbiblioteca.catalogo.entity;

import br.univille.microservbiblioteca.domain.Status;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.time.LocalDateTime;

@Container(containerName = "livro", autoCreateContainer = true)
public class Livro{

    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private int codigo;
    private String nome;
    private String autor;
    private String editora;
    private String edicao;
    private String Genero;
    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public Livro() {}

    public Livro(int codigo, String nome, String autor, String editora, String edicao, String Genero, Status status) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.Genero = Genero;
        this.status = status;
    }
    
    public String getId() {
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