package org.example.entity;

import lombok.*;

import javax.persistence.*;

//owning side
@Entity
@Table(name = "player")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NonNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "club_id",referencedColumnName = "id")
    @NonNull
    private Club club;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
