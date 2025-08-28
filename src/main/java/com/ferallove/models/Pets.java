package com.ferallove.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity @Getter @Setter @NoArgsConstructor
public class Pets implements Serializable {

    @Id
    @SequenceGenerator(
            name = "pets_sequence",
            sequenceName = "pets_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pets_sequence"
    )
    private int petId;
    private String name;
    private String species;
    private String breed;
    private int age;
    private char gender;
    private String description;
    private String availabilityStatus;
}
