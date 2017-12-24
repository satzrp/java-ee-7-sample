package com.archospark.person.interfaces;

import java.util.List;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.archospark.common.infrastructure.logging.PerformanceLoggingInterceptor;
import com.archospark.common.messages.ServiceRequest;
import com.archospark.common.messages.ServiceResponse;
import com.archospark.person.application.PersonService;
import com.archospark.person.domain.model.Person;

@Path("/person")
@Interceptors(value = {PerformanceLoggingInterceptor.class})
public class PersonResource {

    @Inject
    private PersonService personService;

    @GET
    @Path("/hello/{name}")
    public Response sayHello(@PathParam("name") final String name) {
        return Response.ok("Hello, " + name).build();
    }

    @GET
    @Path("/")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getAllPerson() {
        List<Person> personList = personService.getAllPerson();
        return Response.ok(new ServiceResponse<List<Person>>(0, personList)).build();
    }

    @GET
    @Path("/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getPerson(@PathParam("id") final Long id) {
        Person person = personService.getPerson(id);
        return Response.ok(new ServiceResponse<Person>(0, person)).build();
    }

    @POST
    @Path("/")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response savePerson(@Valid ServiceRequest<Person> request) {
        personService.savePerson(request.getPayload());
        return Response.ok().build();
    }
}