package com.ferallove.controllers;

import com.ferallove.models.Pets;
import com.ferallove.services.PetsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin( origins = "${DEV.SERVER}")
@RestController
@RequestMapping("/api/pets")
public class PetsController {

    private final PetsServiceImpl petsService;

    public PetsController(PetsServiceImpl petsService){
        this.petsService = petsService;
    }

    @GetMapping("/")
    public ResponseEntity<ArrayList<Pets>> findAll() {
        return ResponseEntity.ok().body(petsService.findAll());
    }

    @GetMapping("/availability")
    public ResponseEntity<ArrayList<Pets>> findPetsByAvailabilityStatus(@RequestParam(name = "available") String availability) {
        return ResponseEntity.ok().body(petsService.findPetsByAvailabilityStatus(availability));
    }

    @GetMapping("/names/{name}")
    public ResponseEntity<ArrayList<Pets>> findPetsByName(@RequestParam("name") String name) {
        return ResponseEntity.ok().body(petsService.findPetsByName(name));
    }

    @GetMapping("/id/{petid}")
    public ResponseEntity<Pets> findPetsByPetId(@RequestParam("petid") int petId) {
        return ResponseEntity.ok().body(petsService.findPetsByPetId(petId));
    }


}
