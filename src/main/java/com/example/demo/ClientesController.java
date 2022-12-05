package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> clientes() {
        return clienteService.clientes();
    }

    @GetMapping(value = "/{identificacion}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente cliente(@PathParam("identificacion") String identificacion) {
        return clienteService.getCliente(identificacion);
    }

}
