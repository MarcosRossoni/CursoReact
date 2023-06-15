package com.api.endpoint;

import com.api.controller.EstadoController;
import com.api.dto.EstadoDTO;
import com.api.dto.project.EstadoListDTO;
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
    public Response create(EstadoDTO estadoDTO){
        estadoDTO = estadoController.create(estadoDTO);
        return Response.ok(estadoDTO).build();
    }

    @PUT
    public Response update(EstadoDTO estadoDTO){
        estadoDTO = estadoController.update(estadoDTO);
        return Response.ok(estadoDTO).build();
    }

    @GET
    public Response finAll(){
        List<EstadoListDTO> list = estadoController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        estadoController.delete(id);
        return Response.ok().build();
    }
}