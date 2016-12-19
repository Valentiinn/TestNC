package com.karayvansky.test.nc.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class BookRunner {

    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();

        BookRunner bookRunner = new BookRunner();

        System.out.println("List of Books:");
        bookRunner.listDevelopers();
    }


    public void listDevelopers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Book> books = session.createQuery("FROM Book").list();
        for (Book book : books) {
            System.out.println(book);
            System.out.println("\n================\n");
        }
        session.close();
    }

}

