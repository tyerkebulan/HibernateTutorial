package org.example.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "passport")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "passport_number")
    @NonNull
    private int passportNumber;

    @OneToOne
    @JoinColumn(name="person_id", referencedColumnName = "id")
    @NonNull
    private Person person;
}
