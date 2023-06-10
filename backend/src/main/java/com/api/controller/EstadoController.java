package com.api.controller;

import com.api.orm.Estado;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

@ApplicationScoped
@Transactional
public class EstadoController {

    public Estado create(Estado estado){
        estado.setDtCadastro(LocalDateTime.now());
        estado.persist();
        return estado;
    }

    public Estado update(Estado estado){
        Estado estadoAtt = Estado.findById(estado.getId());
        estadoAtt.setDsNome(estado.getDsNome());
        estadoAtt.setDsSigla(estado.getDsSigla());
        estadoAtt.setDtAtualizacao(LocalDateTime.now());
        estadoAtt.persist();
        return estadoAtt;
    }

    public PanacheQuery<Estado> findAll(){
       return Estado.findAll();
    }

    public void delete(Long id){
        Estado.delete(String.valueOf(id));
    }
}
