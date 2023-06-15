package com.api.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PessoaDTO {

    private Long id;

    private String dsNome;

    private String cpf;

    private String dsEmail;

    private String dsSenha;

    private String dsEndereco;

    private String dsCep;

    private LocalDateTime dtCriacao;

    private LocalDateTime dtAtualizacao;

    private CidadeDTO cidade;
}
