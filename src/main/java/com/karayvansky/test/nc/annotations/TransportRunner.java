package com.karayvansky.test.nc.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TransportRunner {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        TransportRunner transportRunner = new TransportRunner();
        System.out.println("List of Transports:");
        transportRunner.listTransports();
    }


    public void listTransports() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Transport> transports = session.createQuery("FROM Transport").list();
        for (Transport transport : transports) {
            System.out.println(transport);
            System.out.println("\n================\n");
        }
        session.close();
    }
}
