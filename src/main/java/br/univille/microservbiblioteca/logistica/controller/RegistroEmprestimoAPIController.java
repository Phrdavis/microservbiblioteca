package br.univille.microservbiblioteca.logistica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;
import br.univille.microservbiblioteca.logistica.service.RegistroEmprestimoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/emprestimos")
public class RegistroEmprestimoAPIController {
    
    @Autowired
    private RegistroEmprestimoService service;

    @GetMapping
    public ResponseEntity<List<RegistroEmprestimo>> get() {

        var listaEmprestimo = service.getAll();

        return new ResponseEntity<List<RegistroEmprestimo>>(listaEmprestimo, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<RegistroEmprestimo> post(@RequestBody RegistroEmprestimo emprestimo) {

        if(emprestimo == null){

            return new ResponseEntity<RegistroEmprestimo>(emprestimo, HttpStatus.BAD_REQUEST);

        }

        var emprestimoSalvo = service.save(emprestimo);

        return new ResponseEntity<RegistroEmprestimo>(emprestimoSalvo, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroEmprestimo> put(@PathVariable("id") String id, @RequestBody RegistroEmprestimo emprestimo){

        if(id == null || id == "" || emprestimo == null){

            return new ResponseEntity<RegistroEmprestimo>(HttpStatus.BAD_REQUEST);

        }

        emprestimo = service.update(id, emprestimo);

        if(emprestimo == null){

            return new ResponseEntity<RegistroEmprestimo>(HttpStatus.NOT_FOUND);

        }

        return new ResponseEntity<RegistroEmprestimo>(emprestimo, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RegistroEmprestimo> delete(@PathVariable("id") String id){

        if(id == null || id == ""){

            return new ResponseEntity<RegistroEmprestimo>(HttpStatus.BAD_REQUEST);

        }

        var emprestimo = service.delete(id);

        if(emprestimo == null){

            return new ResponseEntity<RegistroEmprestimo>(HttpStatus.NOT_FOUND);

        }

        return new ResponseEntity<RegistroEmprestimo>(emprestimo, HttpStatus.OK);

    }
    

}
