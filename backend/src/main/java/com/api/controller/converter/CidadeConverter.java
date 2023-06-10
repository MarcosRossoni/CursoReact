package com.api.controller.converter;

import com.api.dto.CidadeDTO;
import com.api.orm.Cidade;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CidadeConverter extends GenericConverter<Cidade, CidadeDTO>{

    @Inject
    EstadoConverter estadoConverter;

    @Override
    public CidadeDTO ormToDto(Cidade cidade) {
        return ormToDto(cidade, new CidadeDTO());
    }

    @Override
    public Cidade dtoToOrm(CidadeDTO cidadeDTO) {
        return dtoToOrm(cidadeDTO, new Cidade());
    }

    @Override
    public CidadeDTO ormToDto(Cidade cidade, CidadeDTO cidadeDTO) {

        if (cidade == null){
            return null;
        }

        copy(cidade, cidadeDTO);
        cidadeDTO.setEstado(estadoConverter.ormToDto(cidade.getEstado()));
        return cidadeDTO;
    }

    @Override
    public Cidade dtoToOrm(CidadeDTO cidadeDTO, Cidade cidade) {

        if (cidadeDTO == null){
            return null;
        }

        copy(cidadeDTO, cidade);
        return cidade;
    }

    @Override
    protected String[] ignoreProperties() {
        return new String[]{"estado"};
    }
}
