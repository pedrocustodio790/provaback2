package com.example.provaback2.Controller;

import com.example.provaback2.DTO.MaterialDTO;
import com.example.provaback2.Entity.Material;
import com.example.provaback2.Service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import static org.springframework.data.projection.EntityProjection.ProjectionType.DTO;

@RestController
@RequestMapping("/Material")
public class MateriaController {

    @Autowired
    private MaterialService service;

    @PostMapping
    public ResponseEntity<Material> criarmaterial(@RequestBody MaterialDTO dto){
        return ResponseEntity.ok
    }
    @PutMapping("/id")
    public Material atualizaestoque(@PathVariable Long id , @RequestBody Material material){
        material.setId(id);
    return .save(material);
    }
@DeleteMapping("id/material")
public ResponseEntity <MaterialDTO>  buscarporid(@PathVariable Long id){
    service.remover(id);
    return ResponseEntity.noContent().build();
}
    @GetMapping ("id/")
    public Optional <Material> buscarmaterialid(@PathVariable Long id){
    return materialRepository.findById(id);
}

    }

@GetMapping("/material/estoque")

