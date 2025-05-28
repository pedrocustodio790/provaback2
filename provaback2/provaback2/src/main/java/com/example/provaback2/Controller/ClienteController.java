package com.example.provaback2.Controller;

import com.example.provaback2.DTO.ClienteDTO;
import com.example.provaback2.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ClienteController {

@Autowired
    ClienteRepository clienteRepository;

@GetMapping
    public ResponseEntity<List<ClienteDTO>> getallclientes(){

}





}
