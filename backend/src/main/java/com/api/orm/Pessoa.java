package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pessoa")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1)
public class Pessoa extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_pessoa", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "nome")
    private String dsNome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String dsEmail;

    @Column(name = "senha")
    private String dsSenha;

    @Column(name = "endereco")
    private String dsEndereco;

    @Column(name = "cep")
    private String dsCep;

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;
}
