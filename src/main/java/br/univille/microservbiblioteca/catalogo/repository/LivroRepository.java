package br.univille.microservbiblioteca.catalogo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservbiblioteca.catalogo.entity.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, String>{


    
}
