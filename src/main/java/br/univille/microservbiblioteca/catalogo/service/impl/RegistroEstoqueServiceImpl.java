package br.univille.microservbiblioteca.catalogo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservbiblioteca.catalogo.entity.RegistroEstoque;
import br.univille.microservbiblioteca.catalogo.repository.RegistroEstoqueRepository;
import br.univille.microservbiblioteca.catalogo.service.RegistroEstoqueService;

@Service 
public class RegistroEstoqueServiceImpl implements RegistroEstoqueService {

    @Autowired
    private RegistroEstoqueRepository repository;

    @Override
    public List<RegistroEstoque> getAll(){

        var retornoIterador = repository.findAll();
        var listaEstoque = new ArrayList<RegistroEstoque>();
        
        retornoIterador.forEach(listaEstoque::add);

        return listaEstoque; 

    }
    
    @Override
    public RegistroEstoque save(RegistroEstoque estoque){

        return repository.save(estoque);

    }

    @Override
    public RegistroEstoque update(String id, RegistroEstoque estoque) {
        var buscaEstoque = repository.findById(id);
        if(buscaEstoque.isPresent()){
            var estoqueAntigo = buscaEstoque.get();
            //atualizo os atributos
            estoqueAntigo.setNome(estoque.getNome());
            repository.save(estoqueAntigo);
            return estoqueAntigo;
        }
        return null;
    }

    @Override
    public Aluno delete(String id) {
        var buscaEstoque = repository.findById(id);
        if(buscaEstoque.isPresent()){
            var estoqueAntigo = buscaEstoque.get();
            repository.delete(estoqueAntigo);
            return estoqueAntigo;
        }
        return null;
    }

}
