package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "estado")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado", allocationSize = 1)
public class Estado extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_estado", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "ds_nome")
    private String dsNome;

    @Column(name = "ds_sigla")
    private String dsSigla;

    @Column(name = "dt_cadastro")
    private LocalDateTime dtCadastro;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;
}
