package com.ferallove.repos;

import com.ferallove.models.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SpeciesRepo extends JpaRepository<Species, Integer> {

    Species findSpeciesBySpeciesId(int speciesId);
}
