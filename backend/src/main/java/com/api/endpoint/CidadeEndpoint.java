package com.api.endpoint;

import com.api.controller.CidadeController;
import com.api.controller.EstadoController;
import com.api.dto.CidadeDTO;
import com.api.dto.EstadoDTO;
import com.api.dto.project.CidadeListDTO;
import com.api.dto.project.EstadoListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/cidade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CidadeEndpoint {

    @Inject
    CidadeController cidadeController;

    @POST
    public Response create(CidadeDTO cidadeDTO){
        cidadeDTO = cidadeController.create(cidadeDTO);
        return Response.ok(cidadeDTO).build();
    }

    @PUT
    public Response update(CidadeDTO cidadeDTO){
        cidadeDTO = cidadeController.update(cidadeDTO);
        return Response.ok(cidadeDTO).build();
    }

    @GET
    public Response finAll(){
        List<CidadeListDTO> list = cidadeController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        cidadeController.delete(id);
        return Response.ok().build();
    }

}
