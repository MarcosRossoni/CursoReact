package com.api.controller.converter;

import com.api.dto.PermissaoDTO;
import com.api.orm.Permissao;

public class PermissaoConverter extends GenericConverter<Permissao, PermissaoDTO> {

    @Override
    public PermissaoDTO ormToDto(Permissao permissao) {
        return null;
    }

    @Override
    public Permissao dtoToOrm(PermissaoDTO permissaoDTO) {
        return null;
    }

    @Override
    public PermissaoDTO ormToDto(Permissao permissao, PermissaoDTO permissaoDTO) {
        return null;
    }

    @Override
    public Permissao dtoToOrm(PermissaoDTO permissaoDTO, Permissao permissao) {
        return null;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
