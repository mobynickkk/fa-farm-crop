package ru.fa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fa.persistence.entity.Crop;

import java.util.UUID;

@Repository
public interface CropRepository extends JpaRepository<Crop, UUID> {
}
