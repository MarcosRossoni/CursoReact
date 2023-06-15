package com.api.controller;

import com.api.controller.converter.CategoriaConverter;
import com.api.dto.CategoriaDTO;
import com.api.dto.project.CategoriaListDTO;
import com.api.orm.Categoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class CategoriaController {

    @Inject
    CategoriaConverter categoriaConverter;

    public CategoriaDTO create(CategoriaDTO categoriaDTO){

        Categoria categoria = categoriaConverter.dtoToOrm(categoriaDTO);
        categoria.persist();
        return categoriaConverter.ormToDto(categoria);
    }

    public CategoriaDTO update(CategoriaDTO categoriaDTO){
        Categoria categoria = Categoria.findById(categoriaDTO.getId());
        categoriaConverter.dtoToOrm(categoriaDTO, categoria);
        categoria.setDtAlteracao(LocalDateTime.now());
        categoria.persist();
        return categoriaConverter.ormToDto(categoria);
    }

    public List<CategoriaListDTO> findAll(){
        return Categoria.findAll().project(CategoriaListDTO.class).list();
    }

    public void delete(Long id){
        Categoria.deleteById(id);
    }
}
