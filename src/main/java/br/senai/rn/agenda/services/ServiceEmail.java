package br.senai.rn.agenda.services;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.models.Email;
import br.senai.rn.agenda.repositories.EmailDAO;

public class ServiceEmail {

	private EmailDAO dao = new EmailDAO();

	public Boolean salvar(Email email) {
		if (!ObjectUtils.isEmpty(email) || !StringUtils.isEmpty(email.getEmail())) {
			dao.salvar(email);
			return true;
		}
		return false;
	}

	public Boolean remover(Email email) {
		if (!ObjectUtils.isEmpty(email) || !StringUtils.isEmpty(email.getEmail())) {
			if (dao.buscarTodos().contains(email)) {
				dao.remover(email);
				return true;
			}
		}
		return false;
	}

	public Boolean atualizar(Email emailAtual, Email emailNovo) {
		if (!ObjectUtils.isEmpty(emailAtual) || !StringUtils.isEmpty(emailAtual.getEmail())
				|| StringUtils.isEmpty(emailAtual.getEmail()) && StringUtils.isEmpty(emailNovo.getEmail())) {
			if (dao.buscarTodos().contains(emailAtual)) {
				dao.atualizar(emailAtual, emailNovo);
				return true;
			}
		}
		return false;
	}
	
	public Email buscarPorEmail(String email) {
		if (!ObjectUtils.isEmpty(email) || !StringUtils.isEmpty(email.toString())) {
			List<Email> emails =  dao.buscarTodos();
			for (Email f : emails) {
				if (f.getEmail().equals(email)) {
					return f;
				}
			}
		}
		return null;
	}
	
	public Email buscarPorId(Long id) {
		if (ObjectUtils.isEmpty(id) || StringUtils.isEmpty(id.toString())) {
			return dao.buscarPorId(id);
		}
		return null;
	}

	public List<Email> buscarTodos() {
		if (ObjectUtils.isEmpty(dao.buscarTodos()))  {			
			return dao.buscarTodos();
		}
		return null;
	}

}
