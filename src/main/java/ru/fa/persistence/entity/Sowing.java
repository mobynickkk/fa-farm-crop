package ru.fa.persistence.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "sowing")
public class Sowing {
    @Id
    private UUID id;
    private Field field;
    private Crop crop;
    private OffsetDateTime sowingDate;
    @Embedded
    private Amount amount;
}
