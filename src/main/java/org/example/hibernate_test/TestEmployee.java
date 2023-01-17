package org.example.hibernate_test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("Hello");
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//
//        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            System.out.println(session.get(Employee.class, 1));
//
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//        }
    }
}
