package com.example.provaback2.Service;

import com.example.provaback2.Entity.Material;
import com.example.provaback2.Repository.MaterialRepository;
import com.example.provaback2.dto.MaterialDTO;
import com.example.provaback2.dto.MaterialResponseDTO;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public MaterialResponseDTO cadastrar(MaterialDTO dto) {
        Material material = new Material();
        material.setNome(dto.getNome());
        material.setTipo(dto.getTipo());
        material.setQuantidade(dto.getQuantidade());
        material.setEspecificacao(dto.getEspecificacao());

        if (dto.getId() != null) {
            material.setId(dto.getId());
        }

        return toDTO(materialRepository.save(material));
    }

    public List<MaterialResponseDTO> listarTodos() {
        return materialRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public MaterialResponseDTO buscarPorId(Long id) {
        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Material com ID " + id + " não encontrado"));
        return toDTO(material);
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

    public void remover(Long id) {
        if (!materialRepository.existsById(id)) {
            throw new EntityNotFoundException("Material com ID " + id + " não encontrado");
        }
        materialRepository.deleteById(id);
    }

    public MaterialResponseDTO atualiza(Long id, MaterialDTO dto) {
        Material material = materialRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Material com ID " + id + " não encontrado"));

        material.setNome(dto.getNome());
        material.setTipo(dto.getTipo());
        material.setQuantidade(dto.getQuantidade());
        material.setEspecificacao(dto.getEspecificacao());

        return toDTO(materialRepository.save(material));
    }

    // Busca com filtros dinâmicos (RF02)
    public List<MaterialResponseDTO> buscarPorFiltros(String tipo, String especificacao, BigDecimal quantidade) {
        List<Material> materiais = materialRepository.findAll();

        return materiais.stream()
                .filter(m -> tipo == null || m.getTipo().equalsIgnoreCase(tipo))
                .filter(m -> especificacao == null || m.getEspecificacao().equalsIgnoreCase(especificacao))
                .filter(m -> quantidade == null || m.getQuantidade().compareTo(quantidade) == 0)
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}