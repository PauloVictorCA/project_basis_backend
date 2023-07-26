package br.com.basis.praticoprojetback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.basis.praticoprojetback.service.EnderecosService;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecosController {
    @Autowired
    private EnderecosService enderecoService;

    // Métodos para realizar operações CRUD com endereços
}