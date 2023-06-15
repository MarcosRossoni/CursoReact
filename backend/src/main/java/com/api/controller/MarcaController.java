package com.api.controller;

import com.api.controller.converter.MarcaConverter;
import com.api.dto.MarcaDTO;
import com.api.dto.project.MarcaListDTO;
import com.api.orm.Marca;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class MarcaController {

    @Inject
    MarcaConverter marcaConverter;

    public MarcaDTO create(MarcaDTO marcaDTO){

        Marca marca = marcaConverter.dtoToOrm(marcaDTO);
        marca.persist();
        return marcaConverter.ormToDto(marca);
    }

    public MarcaDTO update(MarcaDTO marcaDTO){

        Marca marca = Marca.findById(marcaDTO.getId());
        marcaConverter.dtoToOrm(marcaDTO, marca);
        marca.setDtAtualizacao(LocalDateTime.now());
        marca.persist();
        return marcaConverter.ormToDto(marca);
    }

    public List<MarcaListDTO> findAll(){
        return Marca.findAll().project(MarcaListDTO.class).list();
    }

    public void delete(Long id){
        Marca.deleteById(id);
    }
}

