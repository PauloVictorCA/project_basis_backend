package br.com.basis.praticoprojetback.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
@SuppressWarnings("unused")
public class Pessoas {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String cnpj;

    private String tipoPessoa; // "FISICA" ou "JURIDICA"

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;
    
}
