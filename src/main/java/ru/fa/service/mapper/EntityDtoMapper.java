package ru.fa.service.mapper;

import java.util.Collection;

public interface EntityDtoMapper<T, U> {
    T toEntity(U dto);
    U toDto(T entity);
    Collection<T> toEntity(Collection<U> dtos);
    Collection<U> toDto(Collection<T> entities);
}
