package br.univille.microservbiblioteca.catalogo.service;

import java.util.List;

import br.univille.microservbiblioteca.catalogo.entity.Livro;

public interface LivroService {
    List<Livro> getAll();
    Livro save(Livro livro);
    Livro update(String id, Livro livro);
    Livro delete(String id);
}