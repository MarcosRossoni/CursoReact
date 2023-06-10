package com.api.dto.project;

import com.api.dto.EstadoDTO;
import com.api.orm.Estado;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class CidadeListDTO {

    private Long id;

    private String dsNome;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    private EstadoDTO estado;

    public CidadeListDTO(Long id, String dsNome, LocalDateTime dtCriacao, LocalDateTime dtAtualizacao, Estado estado) {
        this.id = id;
        this.dsNome = dsNome;
        this.dtCriacao = dtCriacao;
        this.dtAtualizacao = dtAtualizacao;
        this.estado = new EstadoDTO(
                estado.getId(),
                estado.getDsNome(),
                estado.getDsSigla(),
                estado.getDtCadastro(),
                estado.getDtAtualizacao());
    }
}
