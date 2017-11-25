package com.archospark.infrastructure.jpa.repository;

import com.archospark.domain.entities.PersonEntity;
import com.archospark.domain.repository.PersonRepository;

public class PersonRepositoryImpl extends CrudRepositoryImpl<PersonEntity, Long> implements PersonRepository {}