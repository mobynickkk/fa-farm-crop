package ru.fa.io.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record SowingAmountDto(BigDecimal amount, String unit) {
}
