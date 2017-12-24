package com.archospark.person.infrastructure.jpa.repository;

import com.archospark.common.infrastructure.jpa.repository.CrudRepositoryImpl;
import com.archospark.person.domain.entities.PersonEntity;
import com.archospark.person.domain.repository.PersonRepository;

public class PersonRepositoryImpl extends CrudRepositoryImpl<PersonEntity, Long> implements PersonRepository {}