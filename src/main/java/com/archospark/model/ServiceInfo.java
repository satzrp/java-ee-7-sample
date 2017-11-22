package com.archospark.model;

import javax.validation.constraints.NotNull;

public class ServiceInfo {
    @NotNull
    private String userName;
    @NotNull
    private String languageCode;
    public ServiceInfo() {}
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getLanguageCode() {
        return languageCode;
    }
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}