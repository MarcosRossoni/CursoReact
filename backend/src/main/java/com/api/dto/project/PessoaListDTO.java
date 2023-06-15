package com.api.dto.project;

import com.api.dto.CidadeDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@RegisterForReflection
public class PessoaListDTO {

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

    public PessoaListDTO(Long id, String dsNome, String cpf, String dsEmail, String dsSenha, String dsEndereco, String dsCep,
                         LocalDateTime dtCriacao, LocalDateTime dtAtualizacao, CidadeDTO cidade) {
        this.id = id;
        this.dsNome = dsNome;
        this.cpf = cpf;
        this.dsEmail = dsEmail;
        this.dsSenha = dsSenha;
        this.dsEndereco = dsEndereco;
        this.dsCep = dsCep;
        this.dtCriacao = dtCriacao;
        this.dtAtualizacao = dtAtualizacao;
        this.cidade = cidade;
    }
}
