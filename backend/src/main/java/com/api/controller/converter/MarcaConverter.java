package com.api.controller.converter;


import com.api.dto.MarcaDTO;
import com.api.orm.Marca;

public class MarcaConverter extends GenericConverter<Marca, MarcaDTO>{

    @Override
    public MarcaDTO ormToDto(Marca marca) {
        return null;
    }

    @Override
    public Marca dtoToOrm(MarcaDTO marcaDTO) {
        return null;
    }

    @Override
    public MarcaDTO ormToDto(Marca marca, MarcaDTO marcaDTO) {
        return null;
    }

    @Override
    public Marca dtoToOrm(MarcaDTO marcaDTO, Marca marca) {
        return null;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
