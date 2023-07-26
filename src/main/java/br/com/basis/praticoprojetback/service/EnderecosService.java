package br.com.basis.praticoprojetback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.praticoprojetback.repository.EnderecosRepository;

@Service
public class EnderecosService {
    @Autowired
    private EnderecosRepository enderecoRepository;

    // Métodos para buscar, adicionar, editar e excluir endereços
}
