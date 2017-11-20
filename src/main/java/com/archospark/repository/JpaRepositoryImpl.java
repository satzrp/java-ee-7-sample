package com.archospark.repository;

import java.util.List;

import javax.persistence.EntityManager;

public class JpaRepositoryImpl<E, PK> implements JpaRepository<E, PK> {

    private EntityManager entityManager;

	@Override
	public E findById(PK id) {
		return null;
	}

	@Override
	public List<E> findAll() {
		return null;
	}

	@Override
	public void save(E e) {
		entityManager.persist(e);
	}

	@Override
	public E update(E e) {
		return entityManager.merge(e);
	}

	@Override
	public void delete(E e) {
		entityManager.remove(e);
	}
}