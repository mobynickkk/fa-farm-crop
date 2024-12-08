package ru.fa.io.dto;

import lombok.Builder;

@Builder(toBuilder = true)
public record CropDto(String id, String name) { }
