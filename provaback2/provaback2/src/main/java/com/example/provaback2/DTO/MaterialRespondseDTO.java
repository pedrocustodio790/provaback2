package com.example.provaback2.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MaterialRespondseDTO {
    private BigDecimal quantidade;
    private Long id;
    private String Nome;

    private String tipo;

    private String especificacao;;

    public MaterialRespondseDTO(Long id, String Nome,String tipo , String especificacao){
        this.id = id;
        this.id = id;
        this.id = especificacao;
        this.id = tipo;
        this.Nome = nome;


    }
