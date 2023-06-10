package com.api.controller;

import com.api.controller.converter.CidadeConverter;
import com.api.dto.CidadeDTO;
import com.api.dto.EstadoDTO;
import com.api.dto.project.CidadeListDTO;
import com.api.dto.project.EstadoListDTO;
import com.api.orm.Cidade;
import com.api.orm.Estado;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class CidadeController {

    @Inject
    CidadeConverter cidadeConverter;

    public CidadeDTO create(CidadeDTO cidadeDTO){

        Cidade cidade = cidadeConverter.dtoToOrm(cidadeDTO);
        cidade.setDtCriacao(LocalDateTime.now());
        cidade.setEstado(Estado.findById(cidadeDTO.getEstado().getId()));
        cidade.persist();
        return cidadeConverter.ormToDto(cidade);
    }

    public CidadeDTO update(CidadeDTO cidadeDTO){
        Cidade cidade = Cidade.findById(cidadeDTO.getId());
        cidadeConverter.dtoToOrm(cidadeDTO, cidade);
        cidade.setDtAtualizacao(LocalDateTime.now());
        cidade.setEstado(Estado.findById(cidadeDTO.getEstado().getId()));
        cidade.persist();
        return cidadeConverter.ormToDto(cidade);
    }

    public List<CidadeListDTO> findAll(){
        return Cidade.findAll().project(CidadeListDTO.class).list();
    }

    public void delete(Long id){
        Cidade.delete(String.valueOf(id));
    }
}
