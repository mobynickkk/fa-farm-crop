package ru.fa.service.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.fa.io.dto.CropDto;
import ru.fa.persistence.repository.CropRepository;
import ru.fa.service.mapper.CropMapper;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CropService implements CrudService<CropDto> {
    private final CropMapper cropMapper;
    private final CropRepository cropRepository;

    @Override
    public CropDto createOrUpdate(CropDto dto) {
        return Optional.of(dto)
                .map(cropMapper::toEntity)
                .map(cropRepository::save)
                .map(cropMapper::toDto)
                .orElseThrow();
    }

    @Override
    public Collection<CropDto> getAll() {
        return cropMapper.toDto(cropRepository.findAll());
    }

    @Override
    public CropDto getById(String id) {
        return cropRepository.findById(UUID.fromString(id))
                .map(cropMapper::toDto)
                .orElseThrow();
    }

    @Override
    public void deleteById(String id) {
        cropRepository.deleteById(UUID.fromString(id));
    }
}
