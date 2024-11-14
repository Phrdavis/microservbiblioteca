package br.univille.microservbiblioteca.pagamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservbiblioteca.pagamento.entity.RegistroPagamentoMulta;

@Repository
public interface RegistroPagamentoMultaRepository extends CrudRepository<RegistroPagamentoMulta, String>{


    
}
