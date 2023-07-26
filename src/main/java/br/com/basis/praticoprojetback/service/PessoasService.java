package br.com.basis.praticoprojetback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.praticoprojetback.repository.PessoasRepository;

@Service
public class PessoasService {
    @Autowired
    private PessoasRepository pessoaRepository;

    // Métodos para buscar, adicionar, editar e excluir pessoas
}
