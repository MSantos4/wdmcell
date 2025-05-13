package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.Modelos.Pedido;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;

public class PedidoDAO {

    private static EntityManager eManager;

    public static void cadastrar(Pedido pedido) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.persist(pedido);
            eManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Ocorreu um erro ao cadastrar o pedido").setVisible(true);
        } finally {
            JPAutil.close();
        }

    }
}
