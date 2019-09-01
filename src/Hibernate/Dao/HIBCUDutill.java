package Hibernate.Dao;

import Hibernate.Utill.HibernateUtill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HIBCUDutill {

    public  static SessionFactory sessionFactory;
    public  static Session session;
    public static void openSession() {

        sessionFactory = HibernateUtill.getSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }
    public static void closeSession(){
        session.getTransaction().commit();
        session.close();
//        sessionFactory.close();
    }
}
