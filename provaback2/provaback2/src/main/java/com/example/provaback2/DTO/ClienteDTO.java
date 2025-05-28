package com.example.provaback2.DTO;

import com.example.provaback2.Entity.CLiente;
import com.example.provaback2.Repository.ClienteRepository;
import lombok.Data;

import java.io.Serializable;
@Data
public class ClienteDTO implements Serializable {

        private Long id;

        private String nome;

        private String telefone;

        private String endereco;



}
