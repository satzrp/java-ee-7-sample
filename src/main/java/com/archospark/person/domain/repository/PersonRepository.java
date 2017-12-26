package com.archospark.person.domain.repository;

import com.archospark.common.infrastructure.jpa.repository.CrudRepository;
import com.archospark.person.domain.entities.PersonEntity;
import com.archospark.person.domain.vo.PersonId;

public interface PersonRepository extends CrudRepository<PersonEntity, PersonId> {}