package ru.fa.service.mapper;

import org.mapstruct.Mapper;
import ru.fa.io.dto.FieldDto;
import ru.fa.persistence.entity.Field;

@Mapper(componentModel = "spring")
public interface FieldMapper extends EntityDtoMapper<Field, FieldDto> { }
