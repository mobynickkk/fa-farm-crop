package ru.fa.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

/**
 * Сельхоз культура
 */
@Data
@Entity
@Table(name = "crop")
public class Crop {
    @Id
    private UUID id;
    private String name;
}
