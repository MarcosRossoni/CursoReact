package com.api.controller.converter;

import com.api.dto.ProdutoDTO;
import com.api.orm.Produto;

public class ProdutoConverter extends GenericConverter<Produto, ProdutoDTO> {

    @Override
    public ProdutoDTO ormToDto(Produto produto) {
        return null;
    }

    @Override
    public Produto dtoToOrm(ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public ProdutoDTO ormToDto(Produto produto, ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public Produto dtoToOrm(ProdutoDTO produtoDTO, Produto produto) {
        return null;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
