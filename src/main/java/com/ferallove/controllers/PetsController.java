package com.ferallove.controllers;

import com.ferallove.models.Pets;
import com.ferallove.services.PetsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/pets")
public class PetsController {

    private final PetsServiceImpl petsService;

    public PetsController(PetsServiceImpl petsService){
        this.petsService = petsService;
    }

    @GetMapping("/availability/{available}")
    public ResponseEntity<ArrayList<Pets>> findPetsByAvailabilityStatus(@RequestParam("available") String availability) {
        return ResponseEntity.ok().body(petsService.findPetsByAvailabilityStatus(availability));
    }
}
