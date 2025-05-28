package com.example.provaback2.Entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String Nome;

private String tipo;

private String especificacao;
@Column(unique = true, updatable = true)
private BigDecimal quantidade;

}
