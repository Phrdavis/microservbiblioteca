package br.univille.microservbiblioteca.logistica.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;

@Repository
public interface RegistroEmprestimoRepository extends CrudRepository<RegistroEmprestimo, String>{


    
}
