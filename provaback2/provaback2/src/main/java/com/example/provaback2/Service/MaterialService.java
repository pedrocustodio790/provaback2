package com.example.provaback2.service;

import com.example.provaback2.dto.MaterialDTO;
import com.example.provaback2.dto.MaterialResponseDTO;
import com.example.provaback2.entity.Material;
import com.example.provaback2.repository.MaterialRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository repository;

    public MaterialResponseDTO cadastrar(MaterialDTO dto) {
        Material material = new Material();
        material.setNome(dto.getNome());
        material.setTipo(dto.getTipo());
        material.setQuantidade(dto.getQuantidade());
        material.setEspecificacao(dto.getEspecificacao());

        // Somente se estiver atualizando (opcional)
        if (dto.getId() != null) {
            material.setId(dto.getId());
        }

        return toDTO(repository.save(material));
    }

    public List<MaterialResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public MaterialResponseDTO buscarPorId(Long id) {
        Material material = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Material com ID " + id + " não encontrado"));
        return toDTO(material);
    }

    public Material buscarEntidadePorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Material com ID " + id + " não encontrado"));
    }

    private MaterialResponseDTO toDTO(Material material) {
        MaterialResponseDTO dto = new MaterialResponseDTO();
        dto.setId(material.getId());
        dto.setNome(material.getNome());
        dto.setTipo(material.getTipo());
        dto.setQuantidade(material.getQuantidade());
        dto.setEspecificacao(material.getEspecificacao());
        return dto;
    }
}
