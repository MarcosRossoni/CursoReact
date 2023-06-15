package com.api.endpoint;

import com.api.controller.CategoriaController;
import com.api.dto.CategoriaDTO;
import com.api.dto.project.CategoriaListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/categoria")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaEndpoint {

    @Inject
    CategoriaController categoriaController;

    @POST
    public Response create(CategoriaDTO categoriaDTO){
        categoriaDTO = categoriaController.create(categoriaDTO);
        return Response.ok(categoriaDTO).build();
    }

    @PUT
    public Response update(CategoriaDTO categoriaDTO){
        categoriaDTO = categoriaController.update(categoriaDTO);
        return Response.ok(categoriaDTO).build();
    }

    @GET
    public Response finAll(){
        List<CategoriaListDTO> list = categoriaController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        categoriaController.delete(id);
        return Response.ok().build();
    }
}
