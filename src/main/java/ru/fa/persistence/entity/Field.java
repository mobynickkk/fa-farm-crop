package ru.fa.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

/**
 * Поле
 */
@Data
@Entity
@Table(name = "field")
public class Field {
    @Id
    private UUID id;
    private String name;
}
