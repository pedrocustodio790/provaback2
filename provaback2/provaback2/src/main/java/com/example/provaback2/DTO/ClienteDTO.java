package com.example.provaback2.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class ClienteDTO implements Serializable {
    private String nome;
    private String telefone;
    private String endereco;
}
