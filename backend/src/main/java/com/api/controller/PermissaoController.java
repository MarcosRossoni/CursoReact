package com.api.controller;

import com.api.controller.converter.PermissaoConverter;
import com.api.dto.PermissaoDTO;
import com.api.dto.project.PermissaoListDTO;
import com.api.orm.Permissao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class PermissaoController {

    @Inject
    PermissaoConverter permissaoConverter;

    public PermissaoDTO create(PermissaoDTO permissaoDTO){

        Permissao permissao = permissaoConverter.dtoToOrm(permissaoDTO);
        permissao.persist();
        return permissaoConverter.ormToDto(permissao);
    }

    public PermissaoDTO update(PermissaoDTO permissaoDTO){

        Permissao permissao = Permissao.findById(permissaoDTO.getId());
        permissaoConverter.dtoToOrm(permissaoDTO, permissao);
        permissao.setDtAlteracao(LocalDateTime.now());
        permissao.persist();
        return permissaoConverter.ormToDto(permissao);
    }

    public List<PermissaoListDTO> findAll(){
        return Permissao.findAll().project(PermissaoListDTO.class).list();
    }

    public void delete(Long id){
        Permissao.deleteById(id);
    }
}
