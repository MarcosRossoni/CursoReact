package com.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CidadeDTO {

    private Long id;

    private String dsNome;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    private EstadoDTO estado;
}
