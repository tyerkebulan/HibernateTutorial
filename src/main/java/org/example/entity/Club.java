package org.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

//parent
@Entity
@Table(name = "club")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Club {

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

    @OneToMany(mappedBy = "club")
    private List<Player> players;

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
