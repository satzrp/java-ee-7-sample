package com.archospark.person.application.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.archospark.person.domain.entities.PersonEntity;
import com.archospark.person.domain.model.Person;
import com.archospark.person.domain.vo.Age;
import com.archospark.person.domain.vo.Name;
import com.archospark.person.domain.vo.PersonId;
import com.archospark.person.domain.vo.PhoneNumber;

public class PersonMapper {
    public PersonEntity personToPersonEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(PersonId.of(person.getId()));
        personEntity.setFirstName(Name.of(person.getFirstName()));
        personEntity.setLastName(Name.of(person.getLastName()));
        personEntity.setAge(Age.of(person.getAge()));
        personEntity.setPhoneNumber(PhoneNumber.of(person.getPhoneNumber()));
        personEntity.setGender(person.getGender());
        return personEntity;
    }
    public Person personEntityToPerson(PersonEntity personEntity) {
        Person person = new Person();
        person.setId(personEntity.getId().toValue());
        person.setFirstName(personEntity.getFirstName().toString());
        person.setLastName(personEntity.getLastName().toString());
        person.setAge(personEntity.getAge().toValue());
        person.setPhoneNumber(personEntity.getPhoneNumber().toString());
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