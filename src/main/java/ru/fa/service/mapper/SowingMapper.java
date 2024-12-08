package ru.fa.service.mapper;

import org.mapstruct.Mapper;
import ru.fa.io.dto.SowingDto;
import ru.fa.persistence.entity.Sowing;

@Mapper(componentModel = "spring", uses = {FieldMapper.class, CropMapper.class, SowingAmountMapper.class})
public interface SowingMapper extends EntityDtoMapper<Sowing, SowingDto> { }
