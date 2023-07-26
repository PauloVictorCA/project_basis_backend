package br.com.basis.praticoprojetback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.basis.praticoprojetback.entity.Enderecos;

@Repository
public interface EnderecosRepository  extends JpaRepository<Enderecos, Long> {
}
