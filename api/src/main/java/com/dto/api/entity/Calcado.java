package com.dto.api.entity;

public class Calcado {

    private String nome;
    private String modelo;
    private String cor;
    private String fabricante;
    private Double valorCompra;
    private Double valorVenda;
    private Double icms;
    private Double lucro;
    private Integer estoque;
    private Integer garantia;
    private Integer tamanho;
    public Calcado(String nome, String modelo, String cor, String fabricante, Double valorCompra, Double valorVenda,
            Double icms, Double lucro, Integer estoque, Integer garantia, Integer tamanho) {
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.icms = icms;
        this.lucro = lucro;
        this.estoque = estoque;
        this.garantia = garantia;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public Double getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
    public Double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public Double getIcms() {
        return icms;
    }
    public void setIcms(Double icms) {
        this.icms = icms;
    }
    public Double getLucro() {
        return lucro;
    }
    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public Integer getGarantia() {
        return garantia;
    }
    public void setGarantia(Integer garantia) {
        this.garantia = garantia;
    }
    public Integer getTamanho() {
        return tamanho;
    }
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    




}
