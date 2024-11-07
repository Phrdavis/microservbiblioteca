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


@RestController
@RequestMapping("/api/v1/livros")
public class LivroAPIController {
    
    @Autowired
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> getLivros() {

        var listaAlunos = service.getAll();

        return new ResponseEntity<List<Livro>>(listaAlunos, HttpStatus.OK);

    }
    

}
