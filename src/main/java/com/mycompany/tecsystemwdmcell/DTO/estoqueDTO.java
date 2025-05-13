package com.mycompany.tecsystemwdmcell.DTO;

public class estoqueDTO {
    private String modelo;
    private int estoque;

    public estoqueDTO() {
    }

    public estoqueDTO(String modelo, int estoque) {
        this.modelo = modelo;
        this.estoque = estoque;
    }

    public estoqueDTO(Object o) {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    
}
