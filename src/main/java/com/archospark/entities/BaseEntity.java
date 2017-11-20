package com.archospark.entities;

public class BaseEntity<PK> {
    private PK id;
    public PK getId() {
        return id;
    }
    public void setId(PK id) {
        this.id = id;
    }
}