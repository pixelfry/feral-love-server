package com.ferallove.services;

import com.ferallove.dto.StoriesDTO;
import com.ferallove.models.Stories;
import com.ferallove.repos.StoriesRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class StoriesServiceImpl implements StoriesService {

    private final StoriesRepo storiesRepo;

    public StoriesServiceImpl(StoriesRepo storiesRepo){
        this.storiesRepo = storiesRepo;
    }

    @Override
    public Stories findStoriesByStoriesId(int storiesId) {
        return null;
    }

    @Override
    public ArrayList<Stories> findStoriesByPetId(int petId) {
        return null;
    }

    @Override
    public ArrayList<Stories> findStoriesByAdopterName(String adopterName) {
        return null;
    }

    @Override
    public ArrayList<Stories> findStoriesByAdoptionDate(LocalDate adoptionDate) {
        return null;
    }

    @Override
    public ArrayList<StoriesDTO> findStoriesByAvailability() {
//        ArrayList<StoriesDTO> stories = storiesRepo.findStoriesByAvailability().stream()
//                .forEach(p -> p);
        return storiesRepo.findStoriesByAvailability();
    }


}
