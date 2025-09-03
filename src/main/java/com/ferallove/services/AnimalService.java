package com.ferallove.services;

import com.ferallove.dto.AnimalDTO;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;

import java.util.ArrayList;

public interface AnimalService {

    AnimalDTO findAnimalByAnimalId(int animalId);
    ArrayList<AnimalDTO> findAnimalByAnimalName(String animalName);
    ArrayList<AnimalDTO> findAnimalByAge(int age);
    ArrayList<AnimalDTO> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus);

}
