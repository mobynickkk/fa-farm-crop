package ru.fa.persistence.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Embeddable
public class Amount {
    private Integer amount;
    @Enumerated(EnumType.STRING)
    private SowingUnit unit;
}
