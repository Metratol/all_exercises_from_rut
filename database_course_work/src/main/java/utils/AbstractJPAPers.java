package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AbstractJPAPers {
    protected EntityManager entityManager;

    public void init(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Persistence");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void close(){
        if(entityManager.getTransaction().isActive()){
            entityManager.getTransaction().commit();
        }
        entityManager.getEntityManagerFactory().close();
        entityManager.close();
    }
}
