package br.senai.rn.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.rn.agenda.models.Contato;
import br.senai.rn.agenda.repositories.ContatoRepository;

@Service
public class ServiceContato {
	
	@Autowired
	private ContatoRepository repository;

	public void save(Contato contato) {
		repository.save(contato);
	}

	public List<Contato> findAll() {
		return repository.findAll();
	}

	public Contato findById(Long id) {
		return repository.findById(id).get();
	}

	public void delete(Contato contato) {
		repository.delete(contato);
	}

}
