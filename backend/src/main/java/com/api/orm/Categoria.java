package com.api.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

//@Data
//@Entity
//@Table(name = "categoria")
//@EqualsAndHashCode(callSuper = true)
//@SequenceGenerator(name = "seq_categoria", sequenceName = "seq_categoria", allocationSize = 1)
//public class Categoria extends PanacheEntityBase implements Serializable {
//
//    private String dsNome;
//
//    private LocalDateTime dtCriacao;
//
//    private LocalDateTime dtAlteracao;
//}
