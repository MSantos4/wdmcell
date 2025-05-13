package com.mycompany.tecsystemwdmcell.Modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "caixa")
public class Caixa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtransacao;
    
    private String tipo_transacao;
    private Double valor;
    private LocalDate data_transacao;
    
    @OneToMany(mappedBy = "caixa", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<ItemPedido> itensDePedido;

    public Caixa() {
    }

    public int getIdtransacao() {
        return idtransacao;
    }

    public void setIdtransacao(int idtransacao) {
        this.idtransacao = idtransacao;
    }

    public String getTipo_transacao() {
        return tipo_transacao;
    }

    public void setTipo_transacao(String tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData_transacao() {
        return data_transacao;
    }

    public void setData_transacao(LocalDate data_transacao) {
        this.data_transacao = data_transacao;
    }

    public List<ItemPedido> getItempedido() {
        return itensDePedido;
    }

    public void setItempedido(List<ItemPedido> itempedido) {
        this.itensDePedido = itempedido;
    }
    
    
}
