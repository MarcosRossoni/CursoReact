package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cidade")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_cidade", sequenceName = "seq_cidade", allocationSize = 1)
public class Cidade extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_cidade", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "ds_nome", nullable = false)
    private String dsNome;

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
}
