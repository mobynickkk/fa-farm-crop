package ru.fa.io.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
public record SowingDto(String id,
                        FieldDto field,
                        CropDto crop,
                        @JsonFormat(pattern = "dd.MM.yyyy hh:mm")
                        OffsetDateTime sowingDate,
                        SowingAmountDto amount) { }
