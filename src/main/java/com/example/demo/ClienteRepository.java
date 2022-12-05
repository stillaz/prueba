package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("1", "Cliente 1", "111 11 11");
        Cliente cliente2 = new Cliente("2", "Cliente 2", "111 11 11");
        Cliente cliente3 = new Cliente("3", "Cliente 3", "111 11 11");
        Cliente cliente4 = new Cliente("4", "Cliente 4", "111 11 11");
        Cliente cliente5 = new Cliente("5", "Cliente 5", "111 11 11");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente find(String identificacion) {
        return clientes.stream().filter(cliente -> cliente.getIdentificacion().equals(identificacion)).findFirst()
                .get();
    }

}