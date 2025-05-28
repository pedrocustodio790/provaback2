package com.example.provaback2.Repository;

import com.example.provaback2.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome); // Busca por nome

    Arrays findByNomeContainingIgnoreCase(String nome);
}