package com.mycompany.tecsystemwdmcell.DTO;

import java.math.BigDecimal;

public class ultimaVendaDTO {
    private String marca;
    private String modelo;
    private int quantidade;
    private Double valor;

    public ultimaVendaDTO() {
    }

    public ultimaVendaDTO(String marca, String modelo, int quantidade, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
    
}
