package com.archospark.application;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

import com.archospark.application.mapper.PersonMapper;
import com.archospark.domain.entities.PersonEntity;
import com.archospark.domain.model.Person;
import com.archospark.domain.repository.PersonRepository;
import com.archospark.domain.vo.Gender;
import com.archospark.infrastructure.logging.LoggingInterceptor;

@Stateless
@Interceptors(value = {LoggingInterceptor.class})
public class PersonServiceImpl implements PersonService {

    @Inject
    private PersonRepository personRepository;

    @Inject
    private PersonMapper personMapper;

    @PostConstruct
    public void init() {
        List<PersonEntity> personEntityList = Arrays.asList(
            new PersonEntity("Sathish", "Kumar", 28, Gender.MALE, "1234567890"),
            new PersonEntity("John", "Doe", 30, Gender.MALE, "9077878789")
        );
        personEntityList.stream().forEach(personEntity -> personRepository.save(personEntity));
    }

    @Override
    public List<Person> getAllPerson() {
        return personMapper.personEntitiesToPersonList(personRepository.findAll());
    }

    @Override
    public Person getPerson(Long id) {
        return personMapper.personEntityToPerson(personRepository.findById(id));
    }

    @Override
    public void savePerson(Person person) {
        PersonEntity personEntity = personMapper.personToPersonEntity(person);
        personRepository.save(personEntity);
    }
}