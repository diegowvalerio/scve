package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOPfisica;
import br.com.scve.modelo.dao.DAOPjuridica;
import br.com.scve.modelo.dao.DAOCliente;
import br.com.scve.modelo.dao.DAOEndereco;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoCliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOCliente dao;
	@Inject
	private DAOPfisica daoF;
	@Inject
	private DAOPjuridica daoJ;
	
	@Inject
	private DAOEndereco daoEnde;

	@Transacao
	public void salvar(Cliente cliente, Pfisica pfisica, Pjuridica pjuridica, String tipoP) {
		try {
			if (cliente.getIdpessoa() == null) {
				cliente.setTipojf(tipoP);
				dao.salvar(cliente);
				if (cliente.getTipojf().equals("F")) {
					pfisica.setPessoa(cliente);
					daoF.salvar(pfisica);
				} else {
					pjuridica.setPessoa(cliente);
					daoJ.salvar(pjuridica);
				}

			} else {
				cliente.setTipojf(tipoP);
				dao.alterar(cliente);
				if (cliente.getTipojf().equals("F")) {
					if (pfisica.getPessoa() == null){
						daoJ.excluir(cliente.getIdpessoa());
						pfisica.setPessoa(cliente);
						daoF.salvar(pfisica);						
					}else{
					daoF.alterar(pfisica);
					}
					
				} else {
					if (pjuridica.getPessoa() == null){
						daoF.excluir(cliente.getIdpessoa());
						pjuridica.setPessoa(cliente);
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

	public List<Cliente> consultar() {
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

	@Transacao
	public void salvarende(Cliente cliente, Pfisica pfisica, Pjuridica pjuridica, String tipoP,Endereco endereco) {
			try {
				if (cliente.getIdpessoa() == null) {
					cliente.setTipojf(tipoP);
					dao.salvar(cliente);
					if (cliente.getTipojf().equals("F")) {
						pfisica.setPessoa(cliente);
						daoF.salvar(pfisica);
					} else {
						pjuridica.setPessoa(cliente);
						daoJ.salvar(pjuridica);
					}
					/*endereco */
					endereco.setPessoa(cliente);
					daoEnde.salvar(endereco);
					
				} else {
					cliente.setTipojf(tipoP);
					dao.alterar(cliente);
					if (cliente.getTipojf().equals("F")) {
						if (pfisica.getPessoa() == null){
							daoJ.excluir(cliente.getIdpessoa());
							pfisica.setPessoa(cliente);
							daoF.salvar(pfisica);						
						}else{
						daoF.alterar(pfisica);
						}
						
					} else {
						if (pjuridica.getPessoa() == null){
							daoF.excluir(cliente.getIdpessoa());
							pjuridica.setPessoa(cliente);
							daoJ.salvar(pjuridica);						
						}else{
							daoJ.alterar(pjuridica);
						}
						
					}
					/*endereco */
					endereco.setPessoa(cliente);
					daoEnde.salvar(endereco);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
