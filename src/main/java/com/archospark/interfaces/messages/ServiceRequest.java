package com.archospark.interfaces.messages;

import javax.validation.Valid;

public class ServiceRequest<T> {
    @Valid
    private ServiceInfo serviceInfo;
    @Valid
    private T payload;
    public ServiceRequest() {}
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }
    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }
    public T getPayload() {
        return payload;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }
}