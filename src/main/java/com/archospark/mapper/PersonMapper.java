package com.archospark.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.archospark.entities.PersonEntity;
import com.archospark.model.Person;

public class PersonMapper {
    private PersonMapper() {

    }
    public static PersonEntity personToPersonEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAge(person.getAge());
        personEntity.setPhoneNumber(person.getPhoneNumber());
        personEntity.setGender(person.getGender());
        return personEntity;
    }
    public static Person personEntityToPerson(PersonEntity personEntity) {
        Person person = new Person();
        person.setFirstName(personEntity.getFirstName());
        person.setLastName(personEntity.getLastName());
        person.setAge(personEntity.getAge());
        person.setPhoneNumber(personEntity.getPhoneNumber());
        person.setGender(personEntity.getGender());
        return person;
    }
    public static List<PersonEntity> personListToPersonEntities(List<Person> personList) {
        return personList.stream().map(PersonMapper::personToPersonEntity).collect(Collectors.toList());
    }
    public static List<Person> personEntitiesToPersonList(List<PersonEntity> personEntities) {
        return personEntities.stream().map(PersonMapper::personEntityToPerson).collect(Collectors.toList());
    }
}