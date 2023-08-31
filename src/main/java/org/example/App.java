package org.example;

import org.example.entity.Car;
import org.example.entity.Club;
import org.example.entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Club.class).addAnnotatedClass(Player.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        //Select query
//        Car car = session.get(Car.class,2);
//        System.out.println(car);

        //HQL
//        List from_car = session.createQuery("from Car").getResultList();
//        System.out.println(from_car);

        //insert query
//        Car car3 = new Car("Kia", "green");
//        session.save(car3);

        //update
//        Car car = session.get(Car.class,2);
//        car.setColor("gold");

        //session.remove(session.get(Car.class,3));

        //getClubWithPlayer
//        Club club = session.get(Club.class,1);
//        System.out.println(club);
//        System.out.println(club.getPlayers());

//        Player player = session.get(Player.class,1);
//        System.out.println(player);
//        System.out.println(player.getClub());

        //add Club
//        Club club = new Club("Barcelona","Spain");
//        session.save(club);

        //add player
//        Club club = session.get(Club.class,3);
//        List<Player> players = club.getPlayers();
//        for (Player player : players) {
//            session.remove(player);
//        }
//        Club club = new Club("Milan","Italy");
//        Player player = new Player("Leau",club);
//        club.setPlayers(new ArrayList<>(Collections.singletonList(player)));
//        session.save(club);
//        session.save(player);
//        Player edenHazard = session.get(Player.class,2);
//        edenHazard.setClub(session.get(Club.class,3));



        // add club and player

        session.getTransaction().commit();

        sessionFactory.close();

    }
}
