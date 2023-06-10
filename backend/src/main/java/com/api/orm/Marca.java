package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "marca")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_marca", sequenceName = "seq_marca", allocationSize = 1)
public class Marca extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_marca", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "dt_criacao", nullable = false)
    private LocalDateTime dtCriacao;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;
}
