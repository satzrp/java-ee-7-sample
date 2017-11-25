package com.archospark.domain.vo;

import java.io.Serializable;

public class Name implements Serializable {
    public static final long serialVersionUID = 1L;

    private final String value;

    private Name(String value) {
        this.value = value;
    }

    public static Name of(String value) {
        /* validation to be done here */
        return new Name(value);
    }

    @Override
    public String toString() {
        return value;
    }
}