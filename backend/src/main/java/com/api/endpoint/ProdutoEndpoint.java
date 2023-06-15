package com.api.endpoint;

import com.api.controller.ProdutoController;
import com.api.dto.ProdutoDTO;
import com.api.dto.project.ProdutoListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/produto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoEndpoint {

    @Inject
    ProdutoController produtoController;

    @POST
    public Response create(ProdutoDTO produtoDTO){
        produtoDTO = produtoController.create(produtoDTO);
        return Response.ok(produtoDTO).build();
    }

    @PUT
    public Response update(ProdutoDTO produtoDTO){
        produtoDTO = produtoController.update(produtoDTO);
        return Response.ok(produtoDTO).build();
    }

    @GET
    public Response finAll(){
        List<ProdutoListDTO> list = produtoController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        produtoController.delete(id);
        return Response.ok().build();
    }
}
