package com.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EstadoDTO {

    private Long id;

    private String dsNome;

    private String dsSigla;

    private LocalDateTime dtCadastro;

    private LocalDateTime dtAtualizacao;

    public EstadoDTO(Long id, String dsNome, String dsSigla, LocalDateTime dtCadastro, LocalDateTime dtAtualizacao) {
        this.id = id;
        this.dsNome = dsNome;
        this.dsSigla = dsSigla;
        this.dtCadastro = dtCadastro;
        this.dtAtualizacao = dtAtualizacao;
    }
}
