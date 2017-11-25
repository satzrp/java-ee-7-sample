package com.archospark;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.archospark.infrastructure.json.validation.ValidationExceptionMapper;
import com.archospark.interfaces.PersonResource;

@ApplicationPath("/api")
public class SampleApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(PersonResource.class);
        classes.add(ValidationExceptionMapper.class);
        return classes;
    }
}
