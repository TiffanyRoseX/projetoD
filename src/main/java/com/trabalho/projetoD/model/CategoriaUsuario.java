package com.trabalho.projetoD.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;
}
