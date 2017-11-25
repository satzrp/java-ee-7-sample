package com.archospark.domain.entities;

public interface BaseEntity<PK> {
    PK getId();
    void setId(PK id);
}