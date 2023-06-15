package com.api.dto.project;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class PermissaoListDTO {

    private Long id;

    private String dsNome;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAlteracao;

    public PermissaoListDTO(Long id, String dsNome, LocalDateTime dtCriacao, LocalDateTime dtAlteracao) {
        this.id = id;
        this.dsNome = dsNome;
        this.dtCriacao = dtCriacao;
        this.dtAlteracao = dtAlteracao;
    }
}