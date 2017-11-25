package com.archospark.infrastructure.jpa.repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CrudRepositoryImpl<E, PK> implements CrudRepository<E, PK> {

	@Produces
	@PersistenceContext(unitName = "h2")
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	private Class<E> getEntityClass() {
		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		return (Class<E>) type.getActualTypeArguments()[0];
	}

	@Override
	public E findById(PK id) {
		return entityManager.find(getEntityClass(), id);
	}

	@Override
	public List<E> findAll() {
		Class<E> clazz = getEntityClass();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<E> cq = cb.createQuery(clazz);
		Root<E> root = cq.from(clazz);
		CriteriaQuery<E> all = cq.select(root);
		TypedQuery<E> allQuery = entityManager.createQuery(all);
		return allQuery.getResultList();
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