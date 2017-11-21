package com.archospark.service;

import java.util.List;

import com.archospark.model.Person;

public interface PersonService {
    List<Person> getAllPerson();
    Person getPerson(Long id);
    void savePerson(Person person);
}