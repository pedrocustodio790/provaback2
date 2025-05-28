package com.example.provaback2.DTO;

import lombok.Data;
import java.io.Serializable;

@Data
public class ClienteResponseDTO implements Serializable {
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
}
