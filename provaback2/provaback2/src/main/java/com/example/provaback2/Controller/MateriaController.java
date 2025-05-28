package com.example.provaback2.controller;

import com.example.provaback2.dto.MaterialDTO;
import com.example.provaback2.dto.MaterialResponseDTO;
import com.example.provaback2.entity.Material;
import com.example.provaback2.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materiais")  // plural e lowercase para REST
public class MaterialController {

    @Autowired
    private MaterialService service;

    // Criar novo material (POST /materiais)
    @PostMapping
    public ResponseEntity<MaterialResponseDTO> criarMaterial(@RequestBody MaterialDTO dto) {
        MaterialResponseDTO criado = service.cadastrar(dto);
        return ResponseEntity.status(201).body(criado);
    }

    // Atualizar material pelo id (PUT /materiais/{id})
    @PutMapping("/{id}")
    public ResponseEntity<MaterialResponseDTO> atualizarMaterial(@PathVariable Long id, @RequestBody MaterialDTO dto) {
        MaterialResponseDTO atualizado = service.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    // Deletar material pelo id (DELETE /materiais/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMaterial(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar material pelo id (GET /materiais/{id})
    @GetMapping("/{id}")
    public ResponseEntity<MaterialResponseDTO> buscarPorId(@PathVariable Long id) {
        MaterialResponseDTO material = service.buscarPorId(id);
        return ResponseEntity.ok(material);
    }

    // Listar todos materiais (GET /materiais)
    @GetMapping
    public ResponseEntity<List<MaterialResponseDTO>> listarTodos() {
        List<MaterialResponseDTO> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }
}
