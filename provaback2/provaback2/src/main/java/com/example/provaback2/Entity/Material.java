package com.example.provaback2.Entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
private BigDecimal quantidade;

}
