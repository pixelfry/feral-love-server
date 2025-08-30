package com.ferallove.controllers;


import com.ferallove.dto.StoriesDTO;
import com.ferallove.models.Stories;
import com.ferallove.services.StoriesServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin( origins = "${DEV.SERVER}")
@RestController
@RequestMapping("/api/stories")
public class StoriesController {

    private final StoriesServiceImpl storiesService;

    public StoriesController(StoriesServiceImpl storiesService){
        this.storiesService = storiesService;
    }

    @GetMapping("/")
    public ResponseEntity<ArrayList<StoriesDTO>> findAllAdoptedStories() {
        return ResponseEntity.ok().body(storiesService.findStoriesByAvailability());
    }
}
