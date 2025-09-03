package com.ferallove.repos;

import com.ferallove.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface LocationRepo extends JpaRepository<Location,Integer> {
    Location findLocationByLocationId(int locationId);
}
