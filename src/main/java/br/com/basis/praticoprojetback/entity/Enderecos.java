package br.com.basis.praticoprojetback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@SuppressWarnings("unused")
public class Enderecos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipoEndereco; // "RESIDENCIAL" ou "COMERCIAL"

	private String endereco;

	private String numero;

	private String complemento;

	private String bairro;

	private String cep;

	private String cidade;

	private String uf;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoas pessoa;

	
}
