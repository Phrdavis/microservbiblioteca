package br.univille.microservbiblioteca.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservbiblioteca.catalogo.entity.Livro;
import br.univille.microservbiblioteca.catalogo.service.LivroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/livros")
public class LivroAPIController {
    
    @Autowired
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> get() {

        var listaAlunos = service.getAll();

        return new ResponseEntity<List<Livro>>(listaAlunos, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Livro> post(@RequestBody Livro livro) {

        if(livro == null){

            return new ResponseEntity<Livro>(livro, HttpStatus.BAD_REQUEST);

        }

        var livroSalvo = service.save(livro);

        return new ResponseEntity<Livro>(livroSalvo, HttpStatus.CREATED);

    }
    

}
