package ru.fa.service.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.fa.io.dto.SowingDto;
import ru.fa.persistence.repository.SowingRepository;
import ru.fa.service.mapper.SowingMapper;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SowingService implements CrudService<SowingDto> {
    private final SowingMapper sowingMapper;
    private final SowingRepository sowingRepository;

    @Override
    public SowingDto createOrUpdate(SowingDto dto) {
        return Optional.of(dto)
                .map(sowingMapper::toEntity)
                .map(sowingRepository::save)
                .map(sowingMapper::toDto)
                .orElseThrow();
    }

    @Override
    public Collection<SowingDto> getAll() {
        return sowingMapper.toDto(sowingRepository.findAll());
    }

    @Override
    public SowingDto getById(String id) {
        return sowingRepository.findById(UUID.fromString(id))
                .map(sowingMapper::toDto)
                .orElseThrow();
    }

    @Override
    public void deleteById(String id) {
        sowingRepository.deleteById(UUID.fromString(id));
    }
}
