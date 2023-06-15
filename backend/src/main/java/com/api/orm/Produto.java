package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "produto")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1)
public class Produto extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_produto", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "ds_curta")
    private String dsCurta;

    @Column(name = "ds_detalhada")
    private String dsDetalhada;

    @Column(name = "vl_custo")
    private Double vlCusto;

    @Column(name = "vl_venda")
    private Double vlVenda;

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @Column(name = "dt_atualizacao")
    private LocalDateTime dtAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

}
