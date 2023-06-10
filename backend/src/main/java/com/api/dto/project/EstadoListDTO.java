package com.api.dto.project;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class EstadoListDTO {

    private Long id;

    private String dsNome;

    private String dsSigla;

    private LocalDateTime dtCadastro;

    private LocalDateTime dtAtualizacao;

    public EstadoListDTO(Long id, String dsNome, String dsSigla, LocalDateTime dtCadastro, LocalDateTime dtAtualizacao) {
        this.id = id;
        this.dsNome = dsNome;
        this.dsSigla = dsSigla;
        this.dtCadastro = dtCadastro;
        this.dtAtualizacao = dtAtualizacao;
    }
}
