package utils;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;

public class AbstractJPA extends HibernateUtil {
    protected EntityManager entityManager;


    Session session = HibernateUtil.getSessionFactory().openSession();
    public void initOne(){
        session.getTransaction().begin();
    }
    public void commitOne(){
        session.getTransaction().commit();
    }

    public void closeA(){
        session.close();
        HibernateUtil.close();
    }
}
