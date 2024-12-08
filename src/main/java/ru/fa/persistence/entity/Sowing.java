package ru.fa.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Посев
 */
@Data
@Entity
@Table(name = "sowing")
public class Sowing {
    @Id
    private UUID id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Field field;
    @ManyToOne(fetch = FetchType.EAGER)
    private Crop crop;
    private OffsetDateTime sowingDate;
    @Embedded
    private Amount amount;
}
