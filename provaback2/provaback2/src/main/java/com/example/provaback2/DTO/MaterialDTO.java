package com.example.provaback2.DTO;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class MaterialDTO {

    private Long id;
    private String Nome;
    private String tipo;
    private String especificacao;
    private BigDecimal quantidade;


}

