package com.ferallove.services;

import com.ferallove.models.Pets;
import com.ferallove.repos.PetsRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PetsServiceImpl implements PetsService {

    private final PetsRepo petsRepo;

    public PetsServiceImpl(PetsRepo petsRepo){
        this.petsRepo = petsRepo;
    }

    @Override
    public Pets findPetsByPetId(int petid) {
        return petsRepo.findPetsByPetId(petid);
    }

    @Override
    public ArrayList<Pets> findPetsByName(String name) {
        return petsRepo.findPetsByName(name);
    }

    @Override
    public ArrayList<Pets> findPetsBySpecies(String species) {
        return petsRepo.findPetsBySpecies(species);
    }

    @Override
    public ArrayList<Pets> findPetsByBreed(String breed) {
        return petsRepo.findPetsByBreed(breed);
    }

    @Override
    public ArrayList<Pets> findPetsByAge(int age) {
        return petsRepo.findPetsByAge(age);
    }

    @Override
    public ArrayList<Pets> findPetsByAvailabilityStatus(String availabilityStatus) {
        return petsRepo.findPetsByAvailabilityStatus(availabilityStatus);
    }
}
