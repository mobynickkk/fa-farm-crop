package ru.fa.persistence.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class Amount {
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private SowingUnit unit;
}
