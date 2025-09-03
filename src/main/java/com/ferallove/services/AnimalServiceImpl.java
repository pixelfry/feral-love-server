package com.ferallove.services;

import com.ferallove.dto.AnimalDTO;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import com.ferallove.models.Species;
import com.ferallove.repos.AnimalRepo;
import com.ferallove.repos.LocationRepo;
import com.ferallove.repos.SpeciesRepo;
import com.ferallove.utils.AnimalAvailabilityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private final AnimalRepo animalRepo;

    public AnimalServiceImpl(AnimalRepo petsRepo){
        this.animalRepo = petsRepo;
    }

    @Override
    public AnimalDTO findAnimalByAnimalId(int animalId) {
        return new AnimalDTO(animalRepo.findAnimalByAnimalId(animalId));
    }

    @Override
    public ArrayList<AnimalDTO> findAnimalByAnimalName(String name) {
        return animalRepo.findAnimalByAnimalName(name)
                .stream()
                .map(AnimalDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<AnimalDTO> findAnimalByAge(int age) {
        return animalRepo.findAnimalByAge(age)
                .stream()
                .map(AnimalDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<AnimalDTO> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus) {
        return animalRepo.findAnimalByAvailabilityStatus(availabilityStatus)
                .stream()
                .map(AnimalDTO::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
