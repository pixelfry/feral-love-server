package com.ferallove.services;

import com.ferallove.dto.AnimalDTO;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;

import java.util.ArrayList;

public interface AnimalService {

    Animal findAnimalByAnimalId(int animalId);
    ArrayList<Animal> findAnimalByAnimalName(String animalName);
    ArrayList<Animal> findAnimalByAge(int age);
    ArrayList<AnimalDTO> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus);
    ArrayList<Animal> findAll();
}
