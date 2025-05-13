package com.mycompany.tecsystemwdmcell.Modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproduto;
    
    private String marca_produto;
    private String modelo_produto;
    private Double preco_compra;
    private Double preco_venda;
    private int estoque;
    
    @OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
    private Especificacao especificacao;

    public Produto() {
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getMarca_produto() {
        return marca_produto;
    }

    public void setMarca_produto(String marca_produto) {
        this.marca_produto = marca_produto;
    }

    public String getModelo_produto() {
        return modelo_produto;
    }

    public void setModelo_produto(String modelo_produto) {
        this.modelo_produto = modelo_produto;
    }

    public Double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(Double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Especificacao getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(Especificacao especificacao) {
        this.especificacao = especificacao;
    }
    
    
    
    
}
