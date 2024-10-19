package br.univille.microservbiblioteca.pagamento.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.univille.microservbiblioteca.logistica.entity.RegistroEmprestimo;

@Entity
public class RegistroPagamentoMulta{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private RegistroEmprestimo id_emprestimo;
    private double valorMulta;
    private double valorPago;
    private DateTime registro;

    public RegistroPagamentoMulta() {}

    public RegistroPagamentoMulta(RegistroEmprestimo id_emprestimo, double valorMulta, double valorPago) {
        this.id_emprestimo = id_emprestimo;
        this.valorMulta = valorMulta;
        this.valorPago = valorPago;
    }

    public UUID getId() {
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

    public DateTime getRegistro() {
        return registro;
    }

}