package ru.fa.service.mapper;

import org.mapstruct.Mapper;
import ru.fa.io.dto.CropDto;
import ru.fa.persistence.entity.Crop;

@Mapper(componentModel = "spring")
public interface CropMapper extends EntityDtoMapper<Crop, CropDto> { }
