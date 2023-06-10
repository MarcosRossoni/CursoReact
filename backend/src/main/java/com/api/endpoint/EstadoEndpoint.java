package com.api.endpoint;

import com.api.controller.EstadoController;
import com.api.orm.Estado;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/estado")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EstadoEndpoint {

    @Inject
    EstadoController estadoController;

    @POST
    public Response create(Estado estado){
        Estado estadoCriado = estadoController.create(estado);
        return Response.ok(estadoCriado).build();
    }

    @PUT
    public Response update(Estado estado){
        Estado update = estadoController.update(estado);
        return Response.ok(update).build();
    }

    @GET
    public Response finAll(){
        PanacheQuery<Estado> listEstado = estadoController.findAll();
        return Response.ok(listEstado).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        estadoController.delete(id);
        return Response.ok().build();
    }
}
