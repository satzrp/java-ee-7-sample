package com.archospark.domain.vo;

import java.io.Serializable;

public class PersonId implements Serializable {
    public static final long serialVersionUID = 1L;

    private final String value;

    private PersonId(String value) {
        this.value = value;
    }

    public static PersonId of(String value) {
        /* validation to be done here */
        return new PersonId(value);
    }

    @Override
    public String toString() {
        return value;
    }
}