package com.api.controller;

import com.api.controller.converter.EstadoConverter;
import com.api.dto.EstadoDTO;
import com.api.dto.project.EstadoListDTO;
import com.api.orm.Estado;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class EstadoController {

    @Inject
    EstadoConverter estadoConverter;

    public EstadoDTO create(EstadoDTO estadoDTO){

        Estado estado = estadoConverter.dtoToOrm(estadoDTO);
        estado.setDtCadastro(LocalDateTime.now());
        estado.persist();
        return estadoConverter.ormToDto(estado);
    }

    public EstadoDTO update(EstadoDTO estadoDTO){
        Estado estado = Estado.findById(estadoDTO.getId());
        estadoConverter.dtoToOrm(estadoDTO, estado);
        estado.setDtAtualizacao(LocalDateTime.now());
        estado.persist();
        return estadoConverter.ormToDto(estado);
    }

    public List<EstadoListDTO> findAll(){
       return Estado.findAll().project(EstadoListDTO.class).list();
    }

    public void delete(Long id){
        Estado.delete(String.valueOf(id));
    }
}
