package ru.fa.service.mapper;

import org.mapstruct.Mapper;
import ru.fa.io.dto.SowingAmountDto;
import ru.fa.persistence.entity.Amount;

@Mapper(componentModel = "spring")
public interface SowingAmountMapper extends EntityDtoMapper<Amount, SowingAmountDto> { }
