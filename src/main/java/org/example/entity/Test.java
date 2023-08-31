package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Person person = session.get(Person.class,2);
        Passport passport = session.get(Passport.class,1);
        person.setPassport(passport);
        passport.setPerson(person);
        session.update(passport);

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
