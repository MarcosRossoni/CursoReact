package com.api.controller.converter;

import com.api.dto.EstadoDTO;
import com.api.orm.Estado;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstadoConverter extends GenericConverter<Estado, EstadoDTO>{

    @Override
    public EstadoDTO ormToDto(Estado estado) {
        return ormToDto(estado, new EstadoDTO());
    }

    @Override
    public Estado dtoToOrm(EstadoDTO estadoDTO) {
        return dtoToOrm(estadoDTO, new Estado());
    }

    @Override
    public EstadoDTO ormToDto(Estado estado, EstadoDTO estadoDTO) {

        if (estado == null){
            return null;
        }

        copy(estado, estadoDTO);
        return estadoDTO;
    }

    @Override
    public Estado dtoToOrm(EstadoDTO estadoDTO, Estado estado) {

        if (estadoDTO == null){
            return null;
        }
        copy(estadoDTO, estado);
        return estado;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[0];
    }
}
