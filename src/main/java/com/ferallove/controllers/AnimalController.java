package com.ferallove.controllers;

import com.ferallove.enums.AnimalAvailability;
import com.ferallove.models.Animal;
import com.ferallove.services.AnimalServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin( origins = "${DEV.SERVER}")
@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    private final AnimalServiceImpl animalService;

    public AnimalController(AnimalServiceImpl animalService){
        this.animalService = animalService;
    }

    @GetMapping("/")
    public ResponseEntity<ArrayList<Animal>> findAll() {
        return ResponseEntity.ok().body(animalService.findAll());
    }

    @GetMapping("/availability")
    public ResponseEntity<ArrayList<Animal>> findAnimalByAvailabilityStatus(@RequestParam("available") String availability) {
        return ResponseEntity.ok().body(animalService.findAnimalByAvailabilityStatus(AnimalAvailability.fromValue(availability)));
    }

    @GetMapping("/name")
    public ResponseEntity<ArrayList<Animal>> findAnimalByName(@RequestParam("name") String name) {
        return ResponseEntity.ok().body(animalService.findAnimalByAnimalName(name));
    }

    @GetMapping("/id")
    public ResponseEntity<Animal> findAnimalByPetId(@RequestParam("animalId") int animalId) {
        return ResponseEntity.ok().body(animalService.findAnimalByAnimalId(animalId));
    }


}
