package ru.fa.service.domain;

import java.util.Collection;

public interface CrudService<T> {
    T createOrUpdate(T dto);

    Collection<T> getAll();

    T getById(String id);

    void deleteById(String id);
}
