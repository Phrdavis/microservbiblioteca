package br.univille.microservbiblioteca.logistica.service;

import java.util.List;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;

public interface RegistroEmprestimoService {
    List<RegistroEmprestimo> getAll();
    RegistroEmprestimo save(RegistroEmprestimo emprestimo);
    RegistroEmprestimo update(String id, RegistroEmprestimo emprestimo);
    RegistroEmprestimo delete(String id);
}