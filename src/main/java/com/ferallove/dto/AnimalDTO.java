package com.ferallove.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.JsonNode;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import com.ferallove.models.Species;
import com.ferallove.utils.AnimalAvailabilityConverter;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.lang.Nullable;

@Data @AllArgsConstructor
public class AnimalDTO {

    private int animalId;
    private String animalName;
    private int locationId;
    private Integer age;
    private char gender;
    private String description;
    @Convert(converter = AnimalAvailabilityConverter.class)
    private AnimalAvailability availabilityStatus;
    private int speciesId;
    private String speciesName;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private JsonNode speciesAttributes;

    public AnimalDTO(Animal animal, Species species) {
        this.animalId = animal.getAnimalId();
        this.animalName = animal.getAnimalName();
        this.locationId = animal.getLocationId();
        this.age = animal.getAge();
        this.gender = animal.getGender();
        this.description = animal.getDescription();
        this.availabilityStatus = animal.getAvailabilityStatus();
        this.speciesId = species.getSpeciesId();
        this.speciesName = species.getSpeciesName();
        this.speciesAttributes = species.getSpeciesAttributes();
    }
}
