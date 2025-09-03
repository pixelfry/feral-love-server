package com.ferallove.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.utils.AnimalAvailabilityConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Entity @Getter @Setter @NoArgsConstructor
public class Animal implements Serializable {

    @Id
    @SequenceGenerator(
            name = "animal_sequence",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pets_sequence"
    )
    private int animalId;
    private String animalName;
//    private int speciesId;
//    private int locationId;
    @Nullable
    private Integer age;
    private char gender;
    private String description;
    @Convert(converter = AnimalAvailabilityConverter.class)
    private AnimalAvailability availabilityStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "speciesId", referencedColumnName = "speciesId")
    private Species species;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    @JsonBackReference
    private Location location;

}
