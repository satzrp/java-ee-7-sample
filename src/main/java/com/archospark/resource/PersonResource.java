package com.archospark.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.archospark.model.Person;
import com.archospark.service.PersonService;

@Path("/person")
public class PersonResource {

    @Inject
    private PersonService personService;

    @GET
    @Path("/hello/{name}")
    public Response sayHello(@PathParam("name") final String name) {
        return Response.ok("Hello, " + name).build();
    }

    @GET
    @Path("/all")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getAllPerson() {
        List<Person> personList = personService.getAllPerson();
        return Response.ok(personList).build();
    }

    @GET
    @Path("/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getPerson(@PathParam("id") final Long id) {
        return Response.ok(personService.getPerson(id)).build();
    }

    @POST
    @Path("/save")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response savePerson(Person person) {
        personService.savePerson(person);
        return Response.ok().build();
    }
}