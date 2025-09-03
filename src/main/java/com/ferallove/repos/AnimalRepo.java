package com.ferallove.repos;

import com.ferallove.dto.AnimalDTO;
import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface AnimalRepo extends JpaRepository<Animal, Integer> {
    Animal findAnimalByAnimalId(int animalId);
    ArrayList<Animal> findAnimalByAnimalName(String animalName);
    ArrayList<Animal> findAnimalByAge(int age);
    ArrayList<Animal> findAnimalByAvailabilityStatus(AnimalAvailability availabilityStatus);
    @Override
    List<Animal> findAll();
}
