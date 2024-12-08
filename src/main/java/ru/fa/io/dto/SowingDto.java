package ru.fa.io.dto;

import lombok.Builder;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
public record SowingDto(String id,
                        FieldDto field,
                        CropDto cropDto,
                        OffsetDateTime sowingDate,
                        SowingAmountDto amount) { }
