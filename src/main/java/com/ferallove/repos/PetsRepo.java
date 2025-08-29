package com.ferallove.repos;

import com.ferallove.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface PetsRepo extends JpaRepository<Pets, Integer> {
    Pets findPetsByPetId(int petid);
    ArrayList<Pets> findPetsByName(String name);
    ArrayList<Pets> findPetsBySpecies(String species);
    ArrayList<Pets> findPetsByBreed(String breed);
    ArrayList<Pets> findPetsByAge(int age);
    ArrayList<Pets> findPetsByAvailabilityStatus(String availabilityStatus);
    @Override
    List<Pets> findAll();
}
