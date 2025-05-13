package com.mycompany.tecsystemwdmcell.DAO;

import com.mycompany.tecsystemwdmcell.Modelos.ItemPedido;
import com.mycompany.tecsystemwdmcell.Telas.telaAlerta;
import jakarta.persistence.EntityManager;

public class ItemPedidoDAO {

    private static EntityManager eManager;

    public static void cadastrar(ItemPedido itemPedido) {
        eManager = JPAutil.getEntityManager();

        try {
            eManager.getTransaction().begin();
            eManager.persist(itemPedido);
            eManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e);
            eManager.getTransaction().rollback();
            new telaAlerta(null, true, "Ocorreu um erro ao cadastrar Item do Pedido").setVisible(true);
        } finally {
            JPAutil.close();
        }
    }
}
