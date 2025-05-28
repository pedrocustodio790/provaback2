package com.example.provaback2.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MaterialDTO {
    private Long id;
    private String nome;
    private String tipo;
    private String especificacao;
    private BigDecimal quantidade;
}
