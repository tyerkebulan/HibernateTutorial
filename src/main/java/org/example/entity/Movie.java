package org.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movie")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "country")
    @NonNull
    private String country;

    @ManyToMany(mappedBy = "movieList")
    private List<Actor> actorList;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
