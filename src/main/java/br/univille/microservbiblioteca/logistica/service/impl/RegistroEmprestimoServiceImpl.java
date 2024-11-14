package br.univille.microservbiblioteca.logistica.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;
import br.univille.microservbiblioteca.logistica.repository.RegistroEmprestimoRepository;
import br.univille.microservbiblioteca.logistica.service.RegistroEmprestimoService;

@Service 
public class RegistroEmprestimoServiceImpl implements RegistroEmprestimoService {

    @Autowired
    private RegistroEmprestimoRepository repository;

    @Override
    public List<RegistroEmprestimo> getAll(){

        var retornoIterador = repository.findAll();
        var listaEmprestimo = new ArrayList<RegistroEmprestimo>();
        
        retornoIterador.forEach(listaEmprestimo::add);

        return listaEmprestimo;

    }
    
    @Override
    public RegistroEmprestimo save(RegistroEmprestimo emprestimo){

        return repository.save(emprestimo);

    }
    
}
