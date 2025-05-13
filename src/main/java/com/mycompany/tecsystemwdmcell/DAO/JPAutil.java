package com.mycompany.tecsystemwdmcell.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAutil {

    private static final String PERSISTENCE_UNIT = "wdmcell-PU";

    static EntityManager eManager;
    static EntityManagerFactory emFactory;

    public static EntityManager getEntityManager() {
        if (emFactory == null || !emFactory.isOpen()) {
            emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        if (eManager == null || !eManager.isOpen()) {
            eManager = emFactory.createEntityManager();
        }
        return eManager;
    }

    public static void close() {
        if (eManager.isOpen() && eManager != null) {
            eManager.close();
            emFactory.close();
        }
    }
}
