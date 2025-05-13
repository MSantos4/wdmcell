package com.mycompany.tecsystemwdmcell.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "itens_de_pedido")
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iditens_de_pedido;
    
    @ManyToOne
    @JoinColumn(name = "produto_idproduto")
    private Produto produto;
    
    private int quantidade;
    
    @ManyToOne
    @JoinColumn(name = "pedido_idpedido")
    private Pedido pedido;
    
    @ManyToOne
    @JoinColumn(name = "caixa_idtransacao")
    private Caixa caixa;

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public ItemPedido() {
    }

    public int getIditens_de_pedido() {
        return iditens_de_pedido;
    }

    public void setIditens_de_pedido(int iditens_de_pedido) {
        this.iditens_de_pedido = iditens_de_pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
