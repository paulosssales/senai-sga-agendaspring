package br.senai.rn.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.rn.agenda.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
}
