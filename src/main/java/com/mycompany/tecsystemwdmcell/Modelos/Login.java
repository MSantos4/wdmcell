package com.mycompany.tecsystemwdmcell.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlogin;
    private String usuario;
    private String senha;
    private String nivel_permissao;
    
    @OneToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private Funcionario funcionario;

    public Login() {
    }

    public int getIdlogin() {
        return idlogin;
    }

    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelpermissao() {
        return nivel_permissao;
    }

    public void setNivelpermissao(String nivelpermissao) {
        this.nivel_permissao = nivelpermissao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
