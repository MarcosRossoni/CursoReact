package com.api.endpoint;

import com.api.controller.PermissaoController;
import com.api.dto.PermissaoDTO;
import com.api.dto.project.PermissaoListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/permissao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PermissaoEndpoint {

    @Inject
    PermissaoController permissaoController;

    @POST
    public Response create(PermissaoDTO permissaoDTO){
        permissaoDTO = permissaoController.create(permissaoDTO);
        return Response.ok(permissaoDTO).build();
    }

    @PUT
    public Response update(PermissaoDTO permissaoDTO){
        permissaoDTO = permissaoController.update(permissaoDTO);
        return Response.ok(permissaoDTO).build();
    }

    @GET
    public Response finAll(){
        List<PermissaoListDTO> list = permissaoController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        permissaoController.delete(id);
        return Response.ok().build();
    }
}
