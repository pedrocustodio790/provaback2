package com.example.provaback2.Service;

import com.example.provaback2.DTO.MaterialDTO;
import com.example.provaback2.DTO.MaterialRespondseDTO;
import com.example.provaback2.Entity.Material;
import com.example.provaback2.Repository.MaterialRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
@Autowired
private MaterialRepository repository;

public MaterialRespondseDTO cadastrar(MaterialDTO dto ){
    Material material = new Material();
    material.setNome(dto.getNome());
    material.setTipo(dto.getTipo());
    material.setQuantidade(dto.getQuantidade());
    material.setEspecificacao(dto.getEspecificacao());
    material.setId(dto.getid());
    return toDTO(repository.save(material))
}
public List<MaterialRespondseDTO> listartodos(){
    return repository.findAll().stream()
            .map(this: :toDTO)
    .collect(Collectos,tolist());
}
public MaterialRespondseDTO buscarporid(Long id){
    Material material = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("material não encontrado "));
                return toDTO(material)
}
private MaterialRespondseDTO toDTO(Material material){
    MaterialDTO dto = new MaterialDTO();
    dto.setNome(dto.getNome());
    material.setTipo(dto.getTipo());
    material.setQuantidade(dto.getQuantidade());
    material.setEspecificacao(dto.getEspecificacao());
    material.setId(dto.getid());
    return dto
}
public Material grtById(Long id){
    return repository.findById(id)
            .orElseThrow(( -> new EntityNotFoundException("MAterial não encontrado"));
}

}
