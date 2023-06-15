package com.api.endpoint;

import com.api.controller.MarcaController;
import com.api.dto.MarcaDTO;
import com.api.dto.project.MarcaListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/marca")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MarcaEndpoint {

    @Inject
    MarcaController marcaController;

    @POST
    public Response create(MarcaDTO marcaDTO){
        marcaDTO = marcaController.create(marcaDTO);
        return Response.ok(marcaDTO).build();
    }

    @PUT
    public Response update(MarcaDTO marcaDTO){
        marcaDTO = marcaController.update(marcaDTO);
        return Response.ok(marcaDTO).build();
    }

    @GET
    public Response finAll(){
        List<MarcaListDTO> list = marcaController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        marcaController.delete(id);
        return Response.ok().build();
    }
}
