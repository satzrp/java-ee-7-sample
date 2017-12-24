package com.archospark;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.archospark.common.infrastructure.json.validation.ValidationExceptionMapper;
import com.archospark.person.interfaces.PersonResource;

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
