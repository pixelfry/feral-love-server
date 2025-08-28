package com.ferallove.services;

import com.ferallove.models.Pets;

import java.util.ArrayList;

public interface PetsService {

    Pets findPetsByPetId(int petid);
    ArrayList<Pets> findPetsByName(String name);
    ArrayList<Pets> findPetsBySpecies(String species);
    ArrayList<Pets> findPetsByBreed(String breed);
    ArrayList<Pets> findPetsByAge(int age);
    ArrayList<Pets> findPetsByAvailabilityStatus(String availabilityStatus);
}
