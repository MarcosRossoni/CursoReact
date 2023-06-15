package com.api.controller.converter;

import com.api.dto.CategoriaDTO;
import com.api.orm.Categoria;

public class CategoriaConverter extends GenericConverter<Categoria, CategoriaDTO>{

    @Override
    public CategoriaDTO ormToDto(Categoria categoria) {
        return null;
    }

    @Override
    public Categoria dtoToOrm(CategoriaDTO categoriaDTO) {
        return null;
    }

    @Override
    public CategoriaDTO ormToDto(Categoria categoria, CategoriaDTO categoriaDTO) {
        return null;
    }

    @Override
    public Categoria dtoToOrm(CategoriaDTO categoriaDTO, Categoria categoria) {
        return null;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
