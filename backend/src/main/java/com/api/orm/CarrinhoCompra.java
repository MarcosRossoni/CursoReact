package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "carrinho_compra")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_carrinho_compra", sequenceName = "seq_carrinho_compra", allocationSize = 1)
public class CarrinhoCompra extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_carrinho_compra", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "dt_compra")
    private LocalDateTime dtCompra;

    @Column(name = "observacao")
    private String dsObservacao;

    @Column(name = "situacao")
    private String dsSituacao;

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;
}
