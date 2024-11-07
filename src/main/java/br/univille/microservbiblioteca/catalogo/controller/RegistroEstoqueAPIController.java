package br.univille.microservbiblioteca.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservbiblioteca.catalogo.entity.RegistroEstoque;
import br.univille.microservbiblioteca.catalogo.service.RegistroEstoqueService;

@RestController
@RequestMapping("/api/v1/estoque")
public class RegistroEstoqueAPIController {
    
    @Autowired
    private RegistroEstoqueService service;

    @GetMapping
    public ResponseEntity<List<RegistroEstoque>> getLivros() {

        var listaEstoque = service.getAll();

        return new ResponseEntity<List<RegistroEstoque>>(listaEstoque, HttpStatus.OK);

    }
    
}
