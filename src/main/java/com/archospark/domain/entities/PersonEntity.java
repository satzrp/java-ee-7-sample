package com.archospark.domain.entities;

import com.archospark.domain.vo.Age;
import com.archospark.domain.vo.Gender;
import com.archospark.domain.vo.Name;
import com.archospark.domain.vo.PersonId;
import com.archospark.domain.vo.PhoneNumber;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntity implements BaseEntity<PersonId> {
    @Id
    private PersonId id;
    private Name firstName;
    private Name lastName;
    private Age age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private PhoneNumber phoneNumber;

    public PersonEntity() {}

    public PersonEntity(PersonId id, Name firstName, Name lastName, Age age, Gender gender, PhoneNumber phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public PersonId getId() {
        return id;
    }
    @Override
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