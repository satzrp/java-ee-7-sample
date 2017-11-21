package com.archospark.entities;

public interface BaseEntity<PK> {
    PK getId();
    void setId(PK id);
}