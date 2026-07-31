package com.dto.api.dto;

import com.dto.api.entity.Calcado;

public class Cliente {

    private String nome;
    private String modelo;
    private Double valorVenda;

    public Cliente(Calcado cal){
        this.nome=cal.getNome();
        this.modelo=cal.getModelo();
        this.valorVenda=cal.getValorVenda();
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

}
