package com.example.provaback2.Controller;

import com.example.provaback2.dto.MaterialDTO;
import com.example.provaback2.dto.MaterialResponseDTO;
import com.example.provaback2.Service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/materiais")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @PostMapping
    public ResponseEntity<MaterialResponseDTO> criarMaterial(@RequestBody MaterialDTO dto) {
        MaterialResponseDTO criado = service.cadastrar(dto);
        return ResponseEntity.status(201).body(criado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaterialResponseDTO> atualizarMaterial(@PathVariable Long id, @RequestBody MaterialDTO dto) {
        MaterialResponseDTO atualizado = service.atualiza(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMaterial(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaterialResponseDTO> buscarPorId(@PathVariable Long id) {
        MaterialResponseDTO material = service.buscarPorId(id);
        return ResponseEntity.ok(material);
    }

    // Busca com filtros por tipo, especificação ou quantidade (RF02)
    @GetMapping
    public ResponseEntity<List<MaterialResponseDTO>> buscarMateriais(
            @RequestParam(required = false) String tipo,
            @RequestParam(required = false) String especificacao,
            @RequestParam(required = false) BigDecimal quantidade
    ) {
        List<MaterialResponseDTO> lista = service.buscarPorFiltros(tipo, especificacao, quantidade);
        return ResponseEntity.ok(lista);
    }
}