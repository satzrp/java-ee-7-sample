package com.archospark.interfaces.common;

import javax.validation.constraints.NotNull;

public class ServiceInfo {
    @NotNull(message = "{not.null.username}")
    private String userName;
    @NotNull(message = "{not.null.language.code}")
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