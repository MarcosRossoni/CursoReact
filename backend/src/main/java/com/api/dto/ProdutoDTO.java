package com.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProdutoDTO {

    private Long id;

    private String dsCurta;

    private String dsDetalhada;

    private Double vlCusto;

    private Double vlVenda;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    private MarcaDTO marca;

    private CategoriaDTO categoria;
}
