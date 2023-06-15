package com.api.controller;

import com.api.controller.converter.PessoaConverter;
import com.api.dto.PessoaDTO;
import com.api.dto.project.PessoaListDTO;
import com.api.orm.Pessoa;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
@Transactional
public class PessoaController {

    @Inject
    PessoaConverter pessoaConverter;

    public PessoaDTO create(PessoaDTO pessoaDTO){

        Pessoa pessoa = pessoaConverter.dtoToOrm(pessoaDTO);
        pessoa.persist();
        return pessoaConverter.ormToDto(pessoa);
    }

    public PessoaDTO update(PessoaDTO pessoaDTO){

        Pessoa pessoa = Pessoa.findById(pessoaDTO.getId());
        pessoaConverter.dtoToOrm(pessoaDTO, pessoa);
        pessoa.setDtAtualizacao(LocalDateTime.now());
        pessoa.persist();
        return pessoaConverter.ormToDto(pessoa);
    }

    public List<PessoaListDTO> findAll(){
        return Pessoa.findAll().project(PessoaListDTO.class).list();
    }

    public void delete(Long id){
        Pessoa.deleteById(id);
    }
}
