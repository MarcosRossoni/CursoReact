package com.api.controller.converter;

import com.api.dto.PessoaDTO;
import com.api.orm.Pessoa;

public class PessoaConverter extends GenericConverter<Pessoa, PessoaDTO> {

    @Override
    public PessoaDTO ormToDto(Pessoa pessoa) {
        return null;
    }

    @Override
    public Pessoa dtoToOrm(PessoaDTO pessoaDTO) {
        return null;
    }

    @Override
    public PessoaDTO ormToDto(Pessoa pessoa, PessoaDTO pessoaDTO) {
        return null;
    }

    @Override
    public Pessoa dtoToOrm(PessoaDTO pessoaDTO, Pessoa pessoa) {
        return null;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
