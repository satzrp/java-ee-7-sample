package com.archospark.domain.vo;

import java.io.Serializable;

public final class PhoneNumber implements Serializable {
    public static final long serialVersionUID = 1L;

    private final String value;

    private PhoneNumber(String value) {
        this.value = value;
    }

    public static PhoneNumber of(String value) {
        /* validation to be done here */
        return new PhoneNumber(value);
    }

    @Override
    public String toString() {
        return value;
    }
}