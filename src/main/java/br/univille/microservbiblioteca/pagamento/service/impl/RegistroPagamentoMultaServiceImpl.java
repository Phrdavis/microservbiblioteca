package br.univille.microservbiblioteca.pagamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservbiblioteca.pagamento.entity.RegistroPagamentoMulta;
import br.univille.microservbiblioteca.pagamento.repository.RegistroPagamentoMultaRepository;
import br.univille.microservbiblioteca.pagamento.service.RegistroPagamentoMultaService;

@Service 
public class RegistroEmprestimoServiceImpl implements RegistroPagamentoMultaService {

    @Autowired
    private RegistroPagamentoMultaRepository repository;

    @Override
    public List<RegistroPagamentoMulta> getAll(){

        var retornoIterador = repository.findAll();
        var listaMulta = new ArrayList<RegistroPagamentoMulta>();
        
        retornoIterador.forEach(listaMulta::add);

        return listaMulta;

    }
    
    @Override
    public RegistroPagamentoMulta save(RegistroPagamentoMulta multa){

        return repository.save(multa);

    }
    
}
