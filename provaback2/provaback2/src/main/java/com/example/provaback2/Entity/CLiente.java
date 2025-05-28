package com.example.provaback2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CLiente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
@Column(unique = false, nullable = true)
    private String telefone;
@Column(unique = true, nullable = false)
    private String endereco;


}
