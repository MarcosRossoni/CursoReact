package com.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PermissaoDTO {

    private Long id;

    private String dsNome;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAlteracao;
}
