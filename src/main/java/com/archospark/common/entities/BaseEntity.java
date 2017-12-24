package com.archospark.common.entities;

public interface BaseEntity<PK> {
    PK getId();
    void setId(PK id);
}