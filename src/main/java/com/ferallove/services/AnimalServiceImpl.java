package com.ferallove.services;

import com.ferallove.dto.AnimalDTO;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import com.ferallove.models.Species;
import com.ferallove.repos.AnimalRepo;
import com.ferallove.repos.SpeciesRepo;
import com.ferallove.utils.AnimalAvailabilityConverter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepo animalRepo;
    private final SpeciesRepo speciesRepo;

    public AnimalServiceImpl(AnimalRepo petsRepo, SpeciesRepo speciesRepo){
        this.animalRepo = petsRepo;
        this.speciesRepo = speciesRepo;
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
    public ArrayList<AnimalDTO> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus) {
        ArrayList<AnimalDTO> animalsDTO = new ArrayList<AnimalDTO>();
        Species species = speciesRepo.findSpeciesBySpeciesId(1);
        ArrayList<Animal> animals = animalRepo.findAnimalByAvailabilityStatus(availabilityStatus);
        for (Animal animal: animals){
            animalsDTO.add(new AnimalDTO(animal, species));
        }
        return animalsDTO;
    }

    @Override
    public ArrayList<Animal> findAll() {
        return new ArrayList<>(animalRepo.findAll());
    }
}
