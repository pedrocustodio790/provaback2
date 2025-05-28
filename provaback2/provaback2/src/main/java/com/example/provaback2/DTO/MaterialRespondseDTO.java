package com.example.provaback2.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MaterialRespondseDTO {
    private Long id;

    private String endereco;
;
    private String Nome;
    private String tipo;
    private String especificacao;
    private BigDecimal quantidade;

    public Long getid() {
        return getid();
    }
}
