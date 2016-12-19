package com.karayvansky.test.nc.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeveloperRunner {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        DeveloperRunner developerRunner = new DeveloperRunner();
        System.out.println("List of Developers:");
        developerRunner.listDevelopers();
    }


    public void listDevelopers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer").list();
        for (Developer developer : developers) {
            System.out.println(developer);
            System.out.println("\n================\n");
        }
        session.close();
    }

}
