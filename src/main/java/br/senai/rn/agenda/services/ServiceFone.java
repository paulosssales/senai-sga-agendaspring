package br.senai.rn.agenda.services;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.models.Fone;
import br.senai.rn.agenda.repositories.FoneDAO;

public class ServiceFone {
	
	private FoneDAO dao = new FoneDAO();
	
	public Boolean salvar(Fone fone) {
		if (!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.getFone())) {
			dao.salvar(fone);
			return true;
		}
		return false;
	}

	public Boolean remover(Fone fone) {
		if (!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.getFone()) ) {
			dao.remover(fone);
			return true;
		}
		return false;
	}
	
	public Boolean atualizar(Fone foneAtual, Fone foneNovo) {
		if (!ObjectUtils.isEmpty(foneAtual) && !ObjectUtils.isEmpty(foneNovo) || !StringUtils.isEmpty(foneAtual.getFone()) && !StringUtils.isEmpty(foneNovo.getFone()) ) {
			if (dao.buscarTodos().contains(foneAtual)) {
				dao.atualizar(foneAtual, foneNovo);
				return true;								
			}	
		}
		return false;
	}

	public Fone buscarPorFone(String fone) {
		if (!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.toString())) {
			List<Fone> fones =  dao.buscarTodos();
			for (Fone f : fones) {
				if (f.getFone().equals(fone)) {
					return f;
				}
			}
		}
		return null;
	}

	public Fone buscarPorId(Long id) {
		if (!ObjectUtils.isEmpty(id) || !ObjectUtils.isEmpty(id)) {
			return dao.buscarPorId(id);
		}
		return null;
	}

	public List<Fone> buscarTodos() {
		if (!ObjectUtils.isEmpty(dao.buscarTodos()))  {			
			return dao.buscarTodos();
		}
		return null;
	}	

}
