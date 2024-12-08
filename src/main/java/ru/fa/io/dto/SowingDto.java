package ru.fa.io.dto;

import lombok.Builder;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
public record SowingDto(String id,
                        FieldDto field,
                        CropDto crop,
                        OffsetDateTime sowingDate,
                        SowingAmountDto amount) { }
