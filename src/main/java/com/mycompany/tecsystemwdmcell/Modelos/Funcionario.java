package com.mycompany.tecsystemwdmcell.Modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfuncionario;
    
    private String nome;
    private String matricula;
    private String cpf;
    
    @OneToOne(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private Login login;
    
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
     List<Pedido> pedidos;

    public Funcionario() {
    }

    public List<Pedido> getPedido() {
        return pedidos;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedidos = pedido;
    }
    
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
