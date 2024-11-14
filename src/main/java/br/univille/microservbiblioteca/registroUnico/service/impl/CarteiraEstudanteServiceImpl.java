package br.univille.microservbiblioteca.registroUnico.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservbiblioteca.registroUnico.entity.CarteiraEstudante;
import br.univille.microservbiblioteca.registroUnico.repository.CarteiraEstudanteRepository;
import br.univille.microservbiblioteca.registroUnico.service.CarteiraEstudanteService;

@Service 
public class CarteiraEstudanteServiceImpl implements CarteiraEstudanteService {

    @Autowired
    private CarteiraEstudanteRepository repository;

    @Override
    public List<CarteiraEstudante> getAll(){

        var retornoIterador = repository.findAll();
        var listaRegistroUnico = new ArrayList<CarteiraEstudante>();
        
        retornoIterador.forEach(listaRegistroUnico::add);

        return listaRegistroUnico;

    }
    
    @Override
    public CarteiraEstudante save(CarteiraEstudante registroUnico){

        return repository.save(registroUnico);

    }

    @Override
    public CarteiraEstudante update(String id, CarteiraEstudante registroUnico) {
        var buscaRegistoUnico = repository.findById(id);
        if(buscaRegistoUnico.isPresent()){
            var registroUnicoAntigo = buscaRegistoUnico.get();
            //atualizo os atributos
            registroUnicoAntigo.setNome(registroUnico.getNome());
            repository.save(registroUnicoAntigo);
            return registroUnicoAntigo;
        }
        return null;
    }

    @Override
    public Aluno delete(String id) {
        var buscaRegistoUnico = repository.findById(id);
        if(buscaRegistoUnico.isPresent()){
            var registroUnicoAntigo = buscaRegistoUnico.get();
            repository.delete(registroUnicoAntigo);
            return registroUnicoAntigo;
        }
        return null;
    }
    
}
