package com.archospark.person.application;

import java.util.List;

import com.archospark.person.domain.model.Person;

public interface PersonService {
    List<Person> getAllPerson();
    Person getPerson(Long id);
    void savePerson(Person person);
}