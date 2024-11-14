package br.univille.microservbiblioteca.registroUnico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservbiblioteca.registroUnico.entity.CarteiraEstudante;

@Repository
public interface CarteiraEstudanteRepository extends CrudRepository<CarteiraEstudante, String>{


    
}
