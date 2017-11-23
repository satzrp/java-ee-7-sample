package com.archospark.model;

import javax.validation.constraints.NotNull;

public class Person {
    private Long id;
    @NotNull(message = "{not.null.first.name}")
    private String firstName;
    @NotNull(message = "{not.null.last.name}")
    private String lastName;
    @NotNull(message = "{not.null.age}")
    private Integer age;
    @NotNull(message = "{not.null.gender}")
    private Gender gender;
    @NotNull(message = "{not.null.phone.number}")
    private String phoneNumber;

    public Person() {
        
    }

    public Person(Long id, String firstName, String lastName, Integer age, Gender gender, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}