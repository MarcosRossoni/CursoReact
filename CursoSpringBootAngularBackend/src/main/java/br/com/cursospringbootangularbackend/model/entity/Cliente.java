package br.com.cursospringbootangularbackend.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NonNull;
import org.hibernate.validator.constraints.br.CPF;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    @NotNull(message = "campo.nome.obrigatorio")
    private String nome;

    @CPF(message = "campo.cpf.invalido")
    @Column(nullable = false, length = 11)
    @NotNull(message = "campo.cpf.obrigatorio")
    private String cpf;

    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataCadastro = LocalDateTime.now();

}
