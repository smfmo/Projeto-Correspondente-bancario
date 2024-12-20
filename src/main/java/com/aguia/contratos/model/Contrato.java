package com.aguia.contratos.model;


import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "contrato")
@Table(name = "contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCliente;
    private String cpf;
    private BigDecimal valorBruto;
    private BigDecimal valorLiquido;
    private BigDecimal valorPrestacao;
    private int numeroPrestacoes;
    private String telefone;
    
    public Contrato(Integer id, String nomeCliente, String cpf, BigDecimal valorBruto, BigDecimal valorLiquido, BigDecimal valorPrestacao, int numeroPrestacoes, String telefone) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.valorBruto = valorBruto;
        this.valorLiquido = valorLiquido;
        this.valorPrestacao = valorPrestacao;
        this.numeroPrestacoes = numeroPrestacoes;
        this.telefone = telefone;
    }


    public Contrato(){
        
    }
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public BigDecimal getValorBruto() {
        return valorBruto;
    }


    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }


    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }


    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }


    public BigDecimal getValorPrestacao() {
        return valorPrestacao;
    }


    public void setValorPrestacao(BigDecimal valorPrestacao) {
        this.valorPrestacao = valorPrestacao;
    }


    public int getNumeroPrestacoes() {
        return numeroPrestacoes;
    }


    public void setNumeroPrestacoes(int numeroPrestacoes) {
        this.numeroPrestacoes = numeroPrestacoes;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


}
