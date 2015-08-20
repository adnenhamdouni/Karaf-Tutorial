package com.person.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("rest")
public interface RestService {


    @POST
    @Path("message")
    @Produces(MediaType.APPLICATION_JSON)
    public String mesageResult(@FormParam("message") String message);

    
    

}
