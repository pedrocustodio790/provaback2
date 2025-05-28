package com.example.provaback2.Repository;

import com.example.provaback2.Entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface MaterialRepository  extends JpaRepository<Material, Long>{
    Optional<List> findbytipo (String Tipo);

}