package ru.fa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.fa.persistence.entity.Sowing;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.UUID;

@Repository
public interface SowingRepository extends JpaRepository<Sowing, UUID> {

    @Query("select s from Sowing s where s.sowingDate between :beginDate and :endDate")
    Collection<Sowing> findInDateRange(OffsetDateTime beginDate, OffsetDateTime endDate);
}
