package com.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MarcaDTO {

    private Long id;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;
}
