package com.archospark.person.application;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import com.archospark.common.infrastructure.logging.LoggingInterceptor;
import com.archospark.person.application.mapper.PersonMapper;
import com.archospark.person.domain.entities.PersonEntity;
import com.archospark.person.domain.model.Person;
import com.archospark.person.domain.repository.PersonRepository;
import com.archospark.person.domain.vo.Age;
import com.archospark.person.domain.vo.Gender;
import com.archospark.person.domain.vo.Name;
import com.archospark.person.domain.vo.PersonId;
import com.archospark.person.domain.vo.PhoneNumber;

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
            new PersonEntity(PersonId.of(1L), Name.of("Sathish"), Name.of("Kumar"), Age.of(28), Gender.MALE, PhoneNumber.of("1234567890")),
            new PersonEntity(PersonId.of(2L), Name.of("John"), Name.of("Doe"), Age.of(30), Gender.MALE, PhoneNumber.of("9077878789"))
        );
        personEntityList.stream().forEach(personEntity -> personRepository.save(personEntity));
        System.out.println("Added to database ..");
    }

    @Override
    public List<Person> getAllPerson() {
        List<PersonEntity> persons = personRepository.findAll();
        return personMapper.personEntitiesToPersonList(persons);
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