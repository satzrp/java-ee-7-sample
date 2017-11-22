package com.archospark.model;

public class ServiceResponse<T> {
    private Integer statusCode;
    private T payload;
    public ServiceResponse() {}
    public ServiceResponse(T payload) {
        this.payload = payload;
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
}