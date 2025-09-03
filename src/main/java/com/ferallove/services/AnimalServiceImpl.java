package com.ferallove.services;

import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import com.ferallove.repos.AnimalRepo;
import com.ferallove.utils.AnimalAvailabilityConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepo animalRepo;

    public AnimalServiceImpl(AnimalRepo petsRepo){
        this.animalRepo = petsRepo;
    }

    @Override
    public Animal findAnimalByAnimalId(int animalId) {
        return animalRepo.findAnimalByAnimalId(animalId);
    }

    @Override
    public ArrayList<Animal> findAnimalByAnimalName(String name) {
        return animalRepo.findAnimalByAnimalName(name);
//                .stream()
//                .filter(p -> p.getName().equals(name))
//                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Animal> findAnimalByAge(int age) {
        return animalRepo.findAnimalByAge(age);
    }

    @Override
    public ArrayList<Animal> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus) {
        return animalRepo.findAnimalByAvailabilityStatus(availabilityStatus);
    }

    @Override
    public ArrayList<Animal> findAll() {
        return new ArrayList<>(animalRepo.findAll());
    }
}
