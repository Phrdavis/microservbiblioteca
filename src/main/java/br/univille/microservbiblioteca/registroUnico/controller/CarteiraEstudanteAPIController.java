package br.univille.microservbiblioteca.registroUnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservbiblioteca.registroUnico.entity.CarteiraEstudante;
import br.univille.microservbiblioteca.registroUnico.service.CarteiraEstudanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/registroUnico")
public class CarteiraEstudanteAPIController {
    
    @Autowired
    private CarteiraEstudanteService service;

    @GetMapping
    public ResponseEntity<List<CarteiraEstudante>> get() {

        var listaRegistroUnico = service.getAll();

        return new ResponseEntity<List<CarteiraEstudante>>(listaRegistroUnico, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<CarteiraEstudante> post(@RequestBody CarteiraEstudante registroUnico) {

        if(registroUnico == null){

            return new ResponseEntity<CarteiraEstudante>(registroUnico, HttpStatus.BAD_REQUEST);

        }

        var registroUnicoSalvo = service.save(registroUnico);

        return new ResponseEntity<CarteiraEstudante>(registroUnicoSalvo, HttpStatus.CREATED);

    }
    

}
