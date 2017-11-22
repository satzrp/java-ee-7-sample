package com.archospark.service.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.archospark.entities.PersonEntity;
import com.archospark.model.Person;

public class PersonMapper {
    public PersonEntity personToPersonEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAge(person.getAge());
        personEntity.setPhoneNumber(person.getPhoneNumber());
        personEntity.setGender(person.getGender());
        return personEntity;
    }
    public Person personEntityToPerson(PersonEntity personEntity) {
        Person person = new Person();
        person.setId(personEntity.getId());
        person.setFirstName(personEntity.getFirstName());
        person.setLastName(personEntity.getLastName());
        person.setAge(personEntity.getAge());
        person.setPhoneNumber(personEntity.getPhoneNumber());
        person.setGender(personEntity.getGender());
        return person;
    }
    public List<PersonEntity> personListToPersonEntities(List<Person> personList) {
        return personList.stream().map(this::personToPersonEntity).collect(Collectors.toList());
    }
    public List<Person> personEntitiesToPersonList(List<PersonEntity> personEntities) {
        return personEntities.stream().map(this::personEntityToPerson).collect(Collectors.toList());
    }
}