package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.Modelos.Funcionario;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private static EntityManager eManager;

    public static void adicionar(Funcionario funcionario) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.persist(funcionario);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Funcionário cadastrado com sucesso").setVisible(true);
        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Não foi possível adicionar o funcionário").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static void editar(Funcionario funcionario) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.merge(funcionario);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Informações do funcionário editado com sucesso").setVisible(true);
        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Não foi possível editar os dados do funcionário").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static void excluir(Funcionario funcionario) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            Funcionario funcionarioExcluir = eManager.merge(funcionario);
            eManager.remove(funcionarioExcluir);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Funcionario removido com sucesso!").setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao excluir funcionario").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static Funcionario listarFuncionario(String ID) {
        eManager = JPAutil.getEntityManager();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario = eManager.find(Funcionario.class, ID);

            return funcionario;
        } catch (Exception e) {
            new telaAlerta(null, true, "Erro ao listar o cliente").setVisible(true);
            return funcionario;
        } finally {
            JPAutil.close();
        }
    }

    public static List<Funcionario> listar() {
        eManager = JPAutil.getEntityManager();
        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            TypedQuery<Funcionario> consulta = eManager.createQuery("SELECT f FROM Funcionario f JOIN FETCH f.login", Funcionario.class);
            funcionarios = consulta.getResultList();

            return funcionarios;
        } catch (Exception e) {
            System.out.println(e);
            new telaAlerta(null, true, "Erro ao listar os funcionários").setVisible(true);
        } finally {
            JPAutil.close();
        }
        return funcionarios;
    }

    public static Funcionario login(String usuario, String senha) {
        eManager = JPAutil.getEntityManager();
        Funcionario funcionario;

        try {
            TypedQuery<Funcionario> consulta = eManager.createQuery("SELECT f From Funcionario f JOIN FETCH f.login l where l.usuario = :usuario AND l.senha  =:senha", Funcionario.class);
            consulta.setParameter("usuario", usuario);
            consulta.setParameter("senha", senha);
            funcionario = consulta.getSingleResult();
            return funcionario;
        } catch (NoResultException e) {

            System.out.println("Nenhum resultado encontrado: " + e.getMessage());
        } catch (NonUniqueResultException e) {
            System.out.println("Mais de um resultado encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        return null;
    }
}
