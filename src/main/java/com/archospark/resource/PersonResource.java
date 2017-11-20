package com.archospark.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonResource {

    @GET
    @Path("/hello/{name}")
    public Response sayHello(@PathParam("name") final String name) {
        return Response.ok("Hello, " + name).build();
    }
}