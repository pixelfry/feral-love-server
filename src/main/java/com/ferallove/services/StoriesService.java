package com.ferallove.services;

import com.ferallove.dto.StoriesDTO;
import com.ferallove.models.Stories;

import java.time.LocalDate;
import java.util.ArrayList;

public interface StoriesService {

    Stories findStoriesByStoriesId(int storiesId);
    ArrayList<Stories> findStoriesByPetId(int petId);
    ArrayList<Stories> findStoriesByAdopterName(String adopterName);
    ArrayList<Stories> findStoriesByAdoptionDate(LocalDate adoptionDate);
    ArrayList<StoriesDTO> findStoriesByAvailability();
}
