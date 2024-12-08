package ru.fa.service.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.fa.io.dto.FieldDto;
import ru.fa.persistence.repository.FieldRepository;
import ru.fa.service.mapper.FieldMapper;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FieldService implements CrudService<FieldDto> {
    private final FieldMapper fieldMapper;
    private final FieldRepository fieldRepository;

    public FieldDto createOrUpdate(FieldDto dto) {
        return Optional.of(dto)
                .map(fieldMapper::toEntity)
                .map(fieldRepository::save)
                .map(fieldMapper::toDto)
                .orElseThrow();
    }

    public Collection<FieldDto> getAll() {
        return fieldMapper.toDto(fieldRepository.findAll());
    }

    public FieldDto getById(String id) {
        return fieldRepository.findById(UUID.fromString(id))
                .map(fieldMapper::toDto)
                .orElseThrow();
    }

    public void deleteById(String id) {
        fieldRepository.deleteById(UUID.fromString(id));
    }
}
