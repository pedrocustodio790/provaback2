
package com.example.provaback2.Entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Data
public class Material {

    private Long id;
    private String nome;
    private String tipo;
    private BigDecimal quantidade;
    private String especificacao;

}