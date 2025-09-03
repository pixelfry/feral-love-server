package com.ferallove.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Location {

    @Id
    @SequenceGenerator(
            name = "location_sequence",
            sequenceName = "location_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "location_sequence"
    )
    private int locationId;
    private String locationName;
    private String locationState;
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Animal> animals;

}
