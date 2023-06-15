package com.api.dto.project;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class MarcaListDTO {

    private Long id;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    public MarcaListDTO(Long id, LocalDateTime dtCriacao, LocalDateTime dtAtualizacao) {
        this.id = id;
        this.dtCriacao = dtCriacao;
        this.dtAtualizacao = dtAtualizacao;
    }
}
