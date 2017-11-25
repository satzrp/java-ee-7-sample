package com.archospark.application;

import java.util.List;

import com.archospark.domain.model.Person;

public interface PersonService {
    List<Person> getAllPerson();
    Person getPerson(Long id);
    void savePerson(Person person);
}