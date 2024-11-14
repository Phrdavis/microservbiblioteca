package br.univille.microservbiblioteca.registroUnico.service;

import java.util.List;

import br.univille.microservbiblioteca.registroUnico.entity.CarteiraEstudante;

public interface CarteiraEstudanteService {
    List<CarteiraEstudante> getAll();
    CarteiraEstudante save(CarteiraEstudante carteiraEstudante);
    CarteiraEstudante update(String id, CarteiraEstudante carteiraEstudante);
    CarteiraEstudante delete(String id);
}