package br.univille.microservbiblioteca.pagamento.service;

import java.util.List;

import br.univille.microservbiblioteca.pagamento.entity.RegistroPagamentoMulta;

public interface RegistroPagamentoMultaService {
    List<RegistroPagamentoMulta> getAll();
    RegistroPagamentoMulta save(RegistroPagamentoMulta multa);
    RegistroPagamentoMulta update(String id, RegistroPagamentoMulta multa);
    RegistroPagamentoMulta delete(String id);
}