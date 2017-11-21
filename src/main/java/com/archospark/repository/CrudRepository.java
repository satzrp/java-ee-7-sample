package com.archospark.repository;

import java.util.List;

public interface CrudRepository<E, PK> {
    E findById(PK id);
    List<E> findAll();
    void save(E e);
    E update(E e);
    void delete(E e);
}