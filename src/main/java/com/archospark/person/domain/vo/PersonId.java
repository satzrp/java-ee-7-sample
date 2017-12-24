package com.archospark.person.domain.vo;

import java.io.Serializable;

public final class PersonId implements Serializable {
    public static final long serialVersionUID = 1L;

    private final Long value;

    private PersonId(Long value) {
        this.value = value;
    }

    public static PersonId of(Long value) {
        /* validation to be done here */
        return new PersonId(value);
    }

    public Long toValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}