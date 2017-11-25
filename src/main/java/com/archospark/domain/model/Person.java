package com.archospark.domain.model;

import javax.validation.constraints.NotNull;

import com.archospark.domain.vo.Age;
import com.archospark.domain.vo.Gender;
import com.archospark.domain.vo.Name;
import com.archospark.domain.vo.PersonId;
import com.archospark.domain.vo.PhoneNumber;

public class Person {
    private PersonId id;
    @NotNull(message = "{not.null.first.name}")
    private Name firstName;
    @NotNull(message = "{not.null.last.name}")
    private Name lastName;
    @NotNull(message = "{not.null.age}")
    private Age age;
    @NotNull(message = "{not.null.gender}")
    private Gender gender;
    @NotNull(message = "{not.null.phone.number}")
    private PhoneNumber phoneNumber;

    public Person() {
        
    }

    public Person(PersonId id, Name firstName, Name lastName, Age age, Gender gender, PhoneNumber phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public PersonId getId() {
        return id;
    }
    public void setId(PersonId id) {
        this.id = id;
    }
    public Name getFirstName() {
        return firstName;
    }
    public void setFirstName(Name firstName) {
        this.firstName = firstName;
    }
    public Name getLastName() {
        return lastName;
    }
    public void setLastName(Name lastName) {
        this.lastName = lastName;
    }
    public Age getAge() {
        return age;
    }
    public void setAge(Age age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}