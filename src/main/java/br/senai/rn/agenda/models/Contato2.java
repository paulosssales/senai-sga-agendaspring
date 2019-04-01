package br.senai.rn.agenda.models;

import java.util.ArrayList;
import java.util.List;

import br.senai.rn.agenda.repositories.PersistDB;

/**
 * 
 * @author Paulo Sales
 *
 */

public class Contato2 implements PersistDB {
	
	/**
	 * Atributo nome
	 * Atributo fones
	 * Atributo emails
	 */
	private Long id;
	private String nome;
	private List<Fone> fones;
	private List<Email> emails;

	/**
	 * Construtores 
	 */
	
	public Contato2() {
		this.fones = new ArrayList<Fone>();
		this.emails = new ArrayList<Email>();
	}
	
	public Contato2(Long id, String nome, List<Fone> fones, List<Email> emails) {
		this.id = id;
		this.setNome(nome);
		this.setFones(fones);
		this.setEmails(emails);	
	}
	
	
	@Override
	public Long getId() {
		return id;
	}
	
	/**
	 * M�todo para adicionar um id
	 *@param id
	 */
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * M�todo para adicionar um telefone
	 *@param fone
	 */
	
	public void adicionarFone(Fone fone) {
		fones.add(fone);
	}
	
	/**
	 * M�todo para adicionar um email
	 * @param email
	 */
	
	public void adicionarEmail(Email email) {
		emails.add(email);
	}
	
	/**
	 * M�todo para remover um telefone
	 *@param fone
	 */
	
	public void removerFone(Fone fone) {
		fones.remove(fone);
	}
	
	/**
	 * M�todo para remover um email
	 * @param email
	 */
	
	public void removerEmail(Email email) {
		emails.remove(email);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
			this.nome = nome.toUpperCase().trim();			
		
	}

	public List<Fone> getFones() {
		return fones;
	}

	public void setFones(List<Fone> fones) {
		this.fones = fones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato2 other = (Contato2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", fones=" + fones + ", emails=" + emails + "]";
	}
	
	
}
