package ch.constructo.repository;

import ch.constructo.entity.Garment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarmentRepository extends JpaRepository<Garment, Long> {
}
