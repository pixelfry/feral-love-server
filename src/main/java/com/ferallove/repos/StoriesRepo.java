package com.ferallove.repos;

import com.ferallove.dto.StoriesDTO;
import com.ferallove.models.Stories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
@Transactional
public interface StoriesRepo extends JpaRepository<Stories,Integer> {
    Stories findStoriesByStoriesId(int storiesId);
    ArrayList<Stories> findStoriesByPetId(int petId);
    ArrayList<Stories> findStoriesByAdopterName(String adopterName);
    ArrayList<Stories> findStoriesByAdoptionDate(LocalDate adoptionDate);
    @Query(value = "SELECT ss.name, ss.adoption_date, ss.story FROM dev.success_stories ss JOIN dev.pets p ON ss.pet_id = p.pet_id WHERE p.availability_status = 'adopted';", nativeQuery = true)
    ArrayList<StoriesDTO> findStoriesByAvailability();
}
