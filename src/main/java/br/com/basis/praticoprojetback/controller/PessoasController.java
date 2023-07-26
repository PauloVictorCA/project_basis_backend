package br.com.basis.praticoprojetback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.basis.praticoprojetback.service.PessoasService;

@RestController
@RequestMapping("/api/pessoas")
public class PessoasController {
    @Autowired
    private PessoasService pessoaService;

    // Métodos para realizar operações CRUD com pessoas
}
