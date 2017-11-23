package com.archospark.model;

import java.util.HashSet;
import java.util.Set;

public class ServiceResponse<T> {
    private Integer statusCode;
    private T payload;
    private Set<String> errors = new HashSet<>();
    public ServiceResponse() {}
    public ServiceResponse(T payload) {
        this.payload = payload;
    }
    public ServiceResponse(Integer statusCode, Set<String> errors) {
        this.statusCode = statusCode;
        this.errors = errors;
    }
    public ServiceResponse(Integer statusCode, T payload) {
        this.statusCode = statusCode;
        this.payload = payload;
    }
    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    public T getPayload() {
        return payload;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }
    public Set<String> getErrors() {
        return errors;
    }
    public void setErrors(Set<String> errors) {
        this.errors = errors;
    }
}