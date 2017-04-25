package com.sdajava.hibernate;

import com.sdajava.hibernate.entity.BooksEntity;
import com.sdajava.hibernate.entity.PersonsEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Main {

    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration
                    = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateError {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
	    Session session = ourSessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List<BooksEntity> books =
                    session.createQuery(
                            "FROM " + BooksEntity.class.getName()).list();

            List<PersonsEntity> persons =
                    session.createQuery(
                            "FROM " + PersonsEntity.class.getName()).list();

            for (BooksEntity book : books) {
                System.out.println(" Tytuł: " + book.getTitle());
                System.out.println(" Autor: " + book.getAuthor());
            }
            for (PersonsEntity person : persons) {
                System.out.println(" Imię: " + person.getFirstName());
                System.out.println(" Nazwisko: " + person.getLastname());
            }
            tx.commit();
        }catch (HibernateException e){
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
