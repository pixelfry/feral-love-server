package com.ferallove.controllers;

import com.ferallove.dto.AnimalDTO;
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


    @GetMapping("/availability")
    public ResponseEntity<ArrayList<AnimalDTO>> findAnimalByAvailabilityStatus(@RequestParam("available") String availability) {
        return ResponseEntity.ok().body(animalService.findAnimalByAvailabilityStatus(AnimalAvailability.fromValue(availability)));
    }

    @GetMapping("/age")
    public ResponseEntity<ArrayList<AnimalDTO>> findAnimalByAge(@RequestParam("age") int age) {
        return ResponseEntity.ok().body(animalService.findAnimalByAge(age));
    }

    @GetMapping("/id")
    public ResponseEntity<AnimalDTO> findAnimalByAnimalId(@RequestParam("animalId") int animalId) {
        return ResponseEntity.ok().body(animalService.findAnimalByAnimalId(animalId));
    }

    @GetMapping("/name")
    public ResponseEntity<ArrayList<AnimalDTO>> findAnimalByName(@RequestParam("name") String name) {
        return ResponseEntity.ok().body(animalService.findAnimalByAnimalName(name));
    }



}
