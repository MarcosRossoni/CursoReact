package com.api.controller;

import com.api.controller.converter.ProdutoConverter;
import com.api.dto.ProdutoDTO;
import com.api.dto.project.ProdutoListDTO;
import com.api.orm.Produto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class ProdutoController {

    @Inject
    ProdutoConverter produtoConverter;

    public ProdutoDTO create(ProdutoDTO produtoDTO){

        Produto produto = produtoConverter.dtoToOrm(produtoDTO);
        produto.persist();
        return produtoConverter.ormToDto(produto);
    }

    public ProdutoDTO update(ProdutoDTO produtoDTO){

        Produto produto = Produto.findById(produtoDTO.getId());
        produtoConverter.dtoToOrm(produtoDTO, produto);
        produto.setDtAtualizacao(LocalDateTime.now());
        produto.persist();
        return produtoConverter.ormToDto(produto);
    }

    public List<ProdutoListDTO> findAll(){
        return Produto.findAll().project(ProdutoListDTO.class).list();
    }

    public void delete(Long id){
        Produto.deleteById(id);
    }
}
