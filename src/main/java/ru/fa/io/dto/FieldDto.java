package ru.fa.io.dto;

import lombok.Builder;

@Builder(toBuilder = true)
public record FieldDto(String id, String name) { }
