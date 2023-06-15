package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "categoria")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_categoria", sequenceName = "seq_categoria", allocationSize = 1)
public class Categoria extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_categoria", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "nome")
    private String dsNome;

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @Column(name = "dt_alteracao")
    private LocalDateTime dtAlteracao;
}
