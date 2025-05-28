package com.example.provaback2.DTO;

import com.example.provaback2.Entity.CLiente;
import com.example.provaback2.Repository.ClienteRepository;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

public CLiente toCliente
        return new CLiente(
                this.id,
                this.telefone
    )


}
