package com.example.provaback2.Service;

import com.example.provaback2.Entity.Cliente;
import com.example.provaback2.Repository.ClienteRepository;
import com.example.provaback2.DTO.ClienteDTO;
import com.example.provaback2.DTO.ClienteResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteResponseDTO cadastrar(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setTelefone(dto.getTelefone());
        cliente.setEndereco(dto.getEndereco());
        return toDTO(clienteRepository.save(cliente));
    }

    public List<ClienteResponseDTO> listarTodos() {
        return clienteRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteResponseDTO buscarPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + id + " não encontrado"));
        return toDTO(cliente);
    }

    public ClienteResponseDTO atualizar(Long id, ClienteDTO dto) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + id + " não encontrado"));

        cliente.setNome(dto.getNome());
        cliente.setTelefone(dto.getTelefone());
        cliente.setEndereco(dto.getEndereco());

        return toDTO(clienteRepository.save(cliente));
    }

    public void excluir(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + id + " não encontrado"));
        clienteRepository.delete(cliente);
    }

    public List<ClienteResponseDTO> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome).stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private ClienteResponseDTO toDTO(Cliente cliente) {
        ClienteResponseDTO dto = new ClienteResponseDTO();
        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setTelefone(cliente.getTelefone());
        dto.setEndereco(cliente.getEndereco());
        return dto;
    }
}