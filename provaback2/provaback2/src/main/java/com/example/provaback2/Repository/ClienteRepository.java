package com.example.provaback2.Repository;

import com.example.provaback2.Entity.CLiente;
import com.example.provaback2.Entity.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository  extends JpaRepository <cliente, Long> {
List<CLiente> findbytelefone(String nome);

}
