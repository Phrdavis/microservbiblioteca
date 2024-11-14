package br.univille.microservbiblioteca.catalogo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservbiblioteca.catalogo.entity.Livro;
import br.univille.microservbiblioteca.catalogo.repository.LivroRepository;
import br.univille.microservbiblioteca.catalogo.service.LivroService;

@Service 
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository repository;

    @Override
    public List<Livro> getAll(){

        var retornoIterador = repository.findAll();
        var listaLivros = new ArrayList<Livro>();
        
        retornoIterador.forEach(listaLivros::add);

        return listaLivros;

    }
    
    @Override
    public Livro save(Livro livro){

        return repository.save(livro);

    }

    @Override
    public Livro update(String id, Livro livro) {
        var buscaLivro = repository.findById(id);
        if(buscaLivro.isPresent()){
            var livroAntigo = buscaLivro.get();
            //atualizo os atributos
            livroAntigo.setNome(livro.getNome());
            repository.save(livroAntigo);
            return livroAntigo;
        }
        return null;
    }

    @Override
    public Aluno delete(String id) {
        var buscaLivro = repository.findById(id);
        if(buscaLivro.isPresent()){
            var livroAntigo = buscaLivro.get();
            repository.delete(livroAntigo);
            return livroAntigo;
        }
        return null;
    }
    
}
