package br.univille.microservbiblioteca.catalogo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "registroEstoque", autoCreateContainer = true)
public class RegistroEstoque{

    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String id_livro;
    private int quantidade;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public RegistroEstoque() {}

    public RegistroEstoque(String id_livro, int quantidade) {
        this.id_livro = id_livro;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public String getIdLivro() {
        return id_livro;
    }

    public void setIdLivro(String id_livro) {
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