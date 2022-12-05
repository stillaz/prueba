package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService() {
    }

    public List<Cliente> clientes() {
        return clienteRepository.getClientes();
    }

    public Cliente getCliente(String identificacion) {
        return clienteRepository.find(identificacion);
    }

}