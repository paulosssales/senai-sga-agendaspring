package br.senai.rn.agenda.services;

/*import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.models.Contato;
import br.senai.rn.agenda.repositories.ContatoRepository;
*/
public class ServiceContato2 {
/*
	private ContatoRepository dao = new ContatoRepository();

	public Boolean salvar(Contato contato) {
		if (ObjectUtils.isEmpty(contato) || StringUtils.isEmpty(contato.getNome())) {
			if (!dao.buscarTodos().contains(contato)) {
				dao.salvar(contato);
				return true;
			}
		}
		return false;
	}

	public Boolean atualizar(Contato contatoAtual, Contato contatoNovo) {
		if (ObjectUtils.isEmpty(contatoAtual) && ObjectUtils.isEmpty(contatoNovo)
				|| StringUtils.isEmpty(contatoAtual.getNome()) && StringUtils.isEmpty(contatoNovo.getNome())) {
			if (!dao.buscarTodos().contains(contatoNovo)) {
				dao.atualizar(contatoAtual, contatoNovo);
				return true;
			}
		}
		return false;
	}

	public Boolean remover(Contato contato) {
		if (ObjectUtils.isEmpty(contato) || StringUtils.isEmpty(contato.getNome())) {
			dao.remover(contato);
			return true;
		}
		return false;
	}

	public Contato buscarPorId(Long id) {
		if (ObjectUtils.isEmpty(id) || StringUtils.isEmpty(id.toString())) {
			return dao.buscarPorId(id);
		}
		return null;
	}

	public List<Contato> buscarTodos() {
		if (ObjectUtils.isEmpty(dao.buscarTodos())) {
			return dao.buscarTodos();
		}
		return null;
	}
*/
}
