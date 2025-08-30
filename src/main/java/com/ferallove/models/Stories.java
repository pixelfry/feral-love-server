package com.ferallove.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.type.StandardBasicTypes;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Stories {

    @Id
    @SequenceGenerator(
            name = "stories_sequence",
            sequenceName = "stories_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "stories_sequence"
    )
    private int storiesId;
    private int petId;
    private String name;
    private String adopterName;
    private LocalDateTime adoptionDate;
    private String story;
}
