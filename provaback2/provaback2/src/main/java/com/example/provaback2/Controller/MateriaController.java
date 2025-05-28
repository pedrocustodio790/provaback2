package com.example.provaback2.Controller;

import com.example.provaback2.Entity.Material;
import com.example.provaback2.Repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Material")
public class MateriaController {

    @Autowired
    private MaterialRepository materialRepository;

    @PostMapping
    public Material criarmaterial(@RequestBody Material material){
        return materialRepository.save(material);
    }
@PutMapping("/id")
    public Material atualizaestoque(@PathVariable Long id , @RequestBody Material material){
        material.setId(id);
    return materialRepository.save(material);
    }
@DeleteMapping("id/material")
    public void  deletamaterial (@PathVariable Long id, Material material){
         materialRepository.deleteById(id);
}
@GetMapping ("id/")
    public Optional <Material> buscarmaterialid(@PathVariable Long id){
    return materialRepository.findById(id);
}
@GetMapping
    public List<Material> buscartodosmaterial{
        return materialRepository.findAll()
    }

}
