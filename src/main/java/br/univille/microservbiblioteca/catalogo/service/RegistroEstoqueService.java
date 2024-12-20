package br.univille.microservbiblioteca.catalogo.service;

import java.util.List;

import br.univille.microservbiblioteca.catalogo.entity.RegistroEstoque;

public interface RegistroEstoqueService {

    List<RegistroEstoque> getAll();
    RegistroEstoque save(RegistroEstoque estoque);
    RegistroEstoque update(String id, RegistroEstoque estoque);
    RegistroEstoque delete(String id);
    
}
