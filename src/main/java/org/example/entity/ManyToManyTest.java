package org.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManyToManyTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Movie.class).addAnnotatedClass(Actor.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        Movie movie = new Movie("War", "USA");
//        Actor actor = new Actor("Actor 1" , 36);
//        Actor actor2 = new Actor("Actor 2" , 25);
//
//        movie.setActorList(new ArrayList<>(List.of(actor,actor2)));
//        actor.setMovieList(new ArrayList<>(Collections.singletonList(movie)));
//        actor2.setMovieList(new ArrayList<>(Collections.singletonList(movie)));
//        session.save(movie);
//        session.save(actor2);
//        session.save(actor);

        Movie movie = session.get(Movie.class,1);
        System.out.println(movie);
        System.out.println(movie.getActorList());

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
