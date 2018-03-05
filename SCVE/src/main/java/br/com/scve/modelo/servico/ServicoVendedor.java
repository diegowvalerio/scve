package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOPfisica;
import br.com.scve.modelo.dao.DAOPjuridica;
import br.com.scve.modelo.dao.DAOVendedor;
import br.com.scve.modelo.dao.DAOContato;
import br.com.scve.modelo.dao.DAOEndereco;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoVendedor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOVendedor dao;
	@Inject
	private DAOPfisica daoF;
	@Inject
	private DAOPjuridica daoJ;
	
	@Inject
	private DAOEndereco daoEnde;
	
	@Inject 
	private DAOContato daoC;

	@Transacao
	public void salvar(Vendedor vendedor, Pfisica pfisica, Pjuridica pjuridica, String tipoP, List<Contato> contatos, List<Endereco> enderecos) {
		try {
			
			if (vendedor.getIdpessoa() == null) {
				vendedor.setTipojf(tipoP);
				dao.salvar(vendedor);
				//daoC.salvarList(contatos);
				//daoEnde.salvarList(enderecos);
				if (vendedor.getTipojf().equals("F")) {
					pfisica.setPessoa(vendedor);
					daoF.salvar(pfisica);
				} else {
					pjuridica.setPessoa(vendedor);
					daoJ.salvar(pjuridica);
				}

			} else {
				vendedor.setTipojf(tipoP);
				dao.alterar(vendedor);
				//daoC.alterarList(contatos);
				//daoEnde.alterarList(enderecos);
				if (vendedor.getTipojf().equals("F")) {
					if (pfisica.getPessoa() == null){
						daoJ.excluir(vendedor.getIdpessoa());
						pfisica.setPessoa(vendedor);
						daoF.salvar(pfisica);						
					}else{
					daoF.alterar(pfisica);
					}
					
				} else {
					if (pjuridica.getPessoa() == null){
						daoF.excluir(vendedor.getIdpessoa());
						pjuridica.setPessoa(vendedor);
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

	public List<Vendedor> consultar() {
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
	
	/*
	public List<Endereco> consultarEnde(Integer id) {
		return daoEnde.consultarEnderecosId(id);
	}

	@Transacao
	public void salvarende(Cliente cliente,Endereco endereco) {
			try {
					endereco.setPessoa(cliente);
					daoEnde.salvar(endereco);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	
	@Transacao
	public boolean excluirEnde(Integer id) {
		List<Endereco> enderecos = daoEnde.consultarEnderecosId(id);
		return daoEnde.excluirEnderecos(enderecos);
	}
	
	@Transacao
	public boolean excluirEnd(Integer id,Integer tipo) {
		List<Endereco> end = daoEnde.consultarEnderecoId(id, tipo);
		return daoEnde.excluirEnderecos(end);
	}
	
	@Transacao
	public boolean ex(Endereco ed){
		return daoEnde.excluirObj(ed);
	}*/
	
	/*contato
	public List<Contato> consultarContato(Integer id) {

		return daoC.consultarContatosporPessoa(id);
	}
	*/
}
