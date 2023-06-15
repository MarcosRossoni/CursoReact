package com.api.endpoint;

import com.api.controller.PessoaController;
import com.api.dto.PessoaDTO;
import com.api.dto.project.PessoaListDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/pessoa")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PessoaEndpoint {

    @Inject
    PessoaController pessoaController;

    @POST
    public Response create(PessoaDTO pessoaDTO){
        pessoaDTO = pessoaController.create(pessoaDTO);
        return Response.ok(pessoaDTO).build();
    }

    @PUT
    public Response update(PessoaDTO pessoaDTO){
        pessoaDTO = pessoaController.update(pessoaDTO);
        return Response.ok(pessoaDTO).build();
    }

    @GET
    public Response finAll(){
        List<PessoaListDTO> list = pessoaController.findAll();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        pessoaController.delete(id);
        return Response.ok().build();
    }
}
