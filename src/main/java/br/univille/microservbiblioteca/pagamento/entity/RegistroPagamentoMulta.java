package br.univille.microservbiblioteca.pagamento.entity;

import java.time.LocalDateTime;


import org.springframework.format.annotation.DateTimeFormat;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;

public class RegistroPagamentoMulta{

    private String id;
    private RegistroEmprestimo id_emprestimo;
    private double valorMulta;
    private double valorPago;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime registro;

    public RegistroPagamentoMulta() {}

    public RegistroPagamentoMulta(RegistroEmprestimo id_emprestimo, double valorMulta, double valorPago) {
        this.id_emprestimo = id_emprestimo;
        this.valorMulta = valorMulta;
        this.valorPago = valorPago;
    }

    public String getId() {
        return id;
    }

    public RegistroEmprestimo getIdEmprestimo() {
        return id_emprestimo;
    }

    public void setIdEmprestimo(RegistroEmprestimo id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

}