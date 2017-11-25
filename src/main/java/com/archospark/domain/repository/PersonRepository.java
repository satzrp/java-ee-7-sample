package com.archospark.domain.repository;

import com.archospark.domain.entities.PersonEntity;
import com.archospark.infrastructure.jpa.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {}