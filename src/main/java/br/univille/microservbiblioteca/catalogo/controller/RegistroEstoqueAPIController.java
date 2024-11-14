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

    @PostMapping
    public ResponseEntity<RegistroEstoque> post(@RequestBody RegistroEstoque estoque) {

        if(estoque == null){

            return new ResponseEntity<RegistroEstoque>(estoque, HttpStatus.BAD_REQUEST);

        }

        var estoqueSalvo = service.save(estoque);

        return new ResponseEntity<RegistroEstoque>(estoqueSalvo, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroEstoque> put(@PathVariable("id") String id, @RequestBody RegistroEstoque estoque){

        if(id == null || id == "" || estoque == null){

            return new ResponseEntity<RegistroEstoque>(HttpStatus.BAD_REQUEST);

        }

        estoque = service.update(id, estoque);

        if(estoque == null){

            return new ResponseEntity<RegistroEstoque>(HttpStatus.NOT_FOUND);

        }

        return new ResponseEntity<RegistroEstoque>(estoque, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RegistroEstoque> delete(@PathVariable("id") String id){

        if(id == null || id == ""){

            return new ResponseEntity<RegistroEstoque>(HttpStatus.BAD_REQUEST);

        }

        var estoque = service.delete(id);

        if(estoque == null){

            return new ResponseEntity<RegistroEstoque>(HttpStatus.NOT_FOUND);

        }

        return new ResponseEntity<RegistroEstoque>(estoque, HttpStatus.OK);

    }
    
}
