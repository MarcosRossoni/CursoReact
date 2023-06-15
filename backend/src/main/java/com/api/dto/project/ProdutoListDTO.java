package com.api.dto.project;

import com.api.dto.CategoriaDTO;
import com.api.dto.MarcaDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class ProdutoListDTO {

    private Long id;

    private String dsCurta;

    private String dsDetalhada;

    private Double vlCusto;

    private Double vlVenda;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    public ProdutoListDTO(Long id, String dsCurta, String dsDetalhada, Double vlCusto, Double vlVenda, LocalDateTime dtCriacao,
                          LocalDateTime dtAtualizacao, MarcaDTO marca, CategoriaDTO categoria) {
        this.id = id;
        this.dsCurta = dsCurta;
        this.dsDetalhada = dsDetalhada;
        this.vlCusto = vlCusto;
        this.vlVenda = vlVenda;
        this.dtCriacao = dtCriacao;
        this.dtAtualizacao = dtAtualizacao;
        this.marca = marca;
        this.categoria = categoria;
    }
}
