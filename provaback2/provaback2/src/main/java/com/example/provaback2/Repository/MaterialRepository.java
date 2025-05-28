package com.example.provaback2.Repository;

import com.example.provaback2.Entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface MaterialRepository  extends JpaRepository<Material, Long>{
    List <Material> findbyTipo(String tipo);
    List <Material>findbyQuantidade(BigDecimal quantidade);
    List <Material> Findbyespecificaca(String especificacao);

}