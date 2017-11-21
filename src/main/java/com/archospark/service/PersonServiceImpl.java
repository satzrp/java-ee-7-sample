package com.archospark.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.archospark.entities.PersonEntity;
import com.archospark.mapper.PersonMapper;
import com.archospark.model.Person;
import com.archospark.repository.PersonRepository;

@Stateless
public class PersonServiceImpl implements PersonService {

    @Inject
    private PersonRepository personRepository;

    @Inject
    private PersonMapper personMapper;

    @PostConstruct
    public void init() {
        List<PersonEntity> personEntityList = Arrays.asList(
            new PersonEntity("Sathish", "Kumar", 28, "MALE", "1234567890"),
            new PersonEntity("John", "Doe", 30, "MALE", "9077878789")
        );
        personEntityList.stream().forEach(personEntity -> personRepository.save(personEntity));
        System.out.println("Data Loaded");
    }

    @Override
    public List<Person> getAllPerson() {
        return personMapper.personEntitiesToPersonList(personRepository.findAll());
    }

    @Override
    public Person getPerson(Long id) {
        return personMapper.personEntityToPerson(personRepository.findById(id));
    }
}