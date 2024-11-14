package br.univille.microservbiblioteca.pagamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservbiblioteca.pagamento.entity.RegistroPagamentoMulta;
import br.univille.microservbiblioteca.pagamento.service.RegistroPagamentoMultaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/multas")
public class RegistroPagamentoMultaAPIController {
    
    @Autowired
    private RegistroPagamentoMultaService service;

    @GetMapping
    public ResponseEntity<List<RegistroPagamentoMulta>> get() {

        var listaMultas = service.getAll();

        return new ResponseEntity<List<RegistroPagamentoMulta>>(listaMultas, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<RegistroPagamentoMulta> post(@RequestBody RegistroPagamentoMulta multa) {

        if(multa == null){

            return new ResponseEntity<RegistroPagamentoMulta>(multa, HttpStatus.BAD_REQUEST);

        }

        var multaSalva = service.save(multa);

        return new ResponseEntity<RegistroPagamentoMulta>(multaSalva, HttpStatus.CREATED);

    }
    

}
