package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Usuario;
import br.com.scve.modelo.dao.DAOPfisica;
import br.com.scve.modelo.dao.DAOPjuridica;
import br.com.scve.modelo.dao.DAOUsuario;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOUsuario dao;
	@Inject
	private DAOPfisica daoF;
	@Inject
	private DAOPjuridica daoJ;

	@Transacao
	public void salvar(Usuario usuario, Pfisica pfisica, Pjuridica pjuridica, String tipoP) {
		try {
			if (usuario.getIdpessoa() == null) {
				usuario.setTipojf(tipoP);
				dao.salvar(usuario);
				if (usuario.getTipojf().equals("F")) {
					pfisica.setPessoa(usuario);
					daoF.salvar(pfisica);
				} else {
					pjuridica.setPessoa(usuario);
					daoJ.salvar(pjuridica);
				}

			} else {
				usuario.setTipojf(tipoP);
				dao.alterar(usuario);
				if (usuario.getTipojf().equals("F")) {
					if (pfisica.getPessoa() == null){
						daoJ.excluir(usuario.getIdpessoa());
						pfisica.setPessoa(usuario);
						daoF.salvar(pfisica);						
					}else{
					daoF.alterar(pfisica);
					}
					
				} else {
					if (pjuridica.getPessoa() == null){
						daoF.excluir(usuario.getIdpessoa());
						pjuridica.setPessoa(usuario);
						daoJ.salvar(pjuridica);						
					}else{
						daoJ.alterar(pjuridica);
					}
					
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transacao
	public boolean excluir(Integer id) {
		
		return dao.excluir(id);
	}

	public List<Usuario> consultar() {
		return dao.consultar();
	}

	public Pfisica consultarPfisica(Integer id) {

		return daoF.consultar(id);
	}

	public Pjuridica consultarPjuridica(Integer id) {

		return daoJ.consultar(id);
	}
	
	@Transacao
	public boolean excluirJ(Integer id) {

		return daoJ.excluir(id);
	}
	@Transacao
	public boolean excluirF(Integer id) {

		return daoF.excluir(id);
	}

}
