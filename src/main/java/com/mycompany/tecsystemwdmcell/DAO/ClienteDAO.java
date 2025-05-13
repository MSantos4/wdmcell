package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.Modelos.Cliente;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static EntityManager eManager;

    public static void cadastrar(Cliente cliente) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.persist(cliente);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Cliente cadastrado com sucesso!").setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Ocorreu um erro ao cadastrar cliente").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static Cliente listarCliente(String ID) {
        eManager = JPAutil.getEntityManager();
        Cliente cliente = new Cliente();

        try {

            cliente = eManager.find(Cliente.class, ID);

            return cliente;

        } catch (Exception e) {
            new telaAlerta(null, true, "Erro ao listar o cliente").setVisible(true);
            return cliente;
        } finally {
            JPAutil.close();
        }
    }

    public static List<Cliente> listar() {
        eManager = JPAutil.getEntityManager();
        List<Cliente> clientes = new ArrayList<>();
        Query consulta;

        try {
            consulta = eManager.createQuery("SELECT c FROM Cliente c");
            clientes = consulta.getResultList();

            return clientes;

        } catch (Exception e) {
            System.out.println(e);
            new telaAlerta(null, true, "Erro ao listar clientes").setVisible(true);
        } finally {
            JPAutil.close();
        }

        return clientes;
    }

    public static void editar(Cliente cliente) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.merge(cliente);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Informações de cliente editadas").setVisible(true);

        } catch (Exception e) {
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao editar cliente").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }

    public static void excluir(Cliente cliente) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.remove(cliente);
            eManager.getTransaction().commit();
            new telaAlerta(null, true, "Cliente removido com sucesso!").setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Erro ao excluir cliente").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }
}
