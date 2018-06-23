package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Cliente;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOPfisica;
import br.com.scve.modelo.dao.DAOPjuridica;
import br.com.scve.modelo.dao.DAOCliente;
//import br.com.scve.modelo.dao.DAOContato;
//import br.com.scve.modelo.dao.DAOEndereco;
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
	
	//@Inject
	//private DAOEndereco daoEnde;
	
	//@Inject 
	//private DAOContato daoC;

	@Transacao
	public void salvar(Cliente cliente, Pfisica pfisica, Pjuridica pjuridica, String tipoP, List<Contato> contatos, List<Endereco> enderecos) {
		try {
			if (cliente.getIdpessoa() == null) {
				cliente.setTipojf(tipoP);
				dao.salvar(cliente);
				//daoC.salvarList(contatos);
				//daoEnde.salvarList(enderecos);
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
				//daoC.alterarList(contatos);
				//daoEnde.alterarList(enderecos);
				
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
	public List<Pfisica> consultarF() {
		return daoF.consultar();
	}
	public List<Pjuridica> consultarJ() {
		return daoJ.consultar();
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
	
	public List<Cliente> buscaclientenome(String nome){
		List<Cliente> pro = null;
		if(!nome.equals("")){
			pro = dao.buscaclientenome(nome);
		}
		return pro;
	}
	
	public List<Cliente> buscaclientenomeevendedor(String nome,Integer v){
		List<Cliente> pro = null;
		if(!nome.equals("")){
			pro = dao.buscaclientenomeevendedor(nome,v);
		}
		return pro;
	}
	
	
	public List<Cliente> consultarAtivos(){
		return dao.consultarAtivos();
	}
	
	/*ws*/
	public Pfisica consultaPfisicaWs(Integer id){
		return daoF.wsPessoafisica(id);
	}
	public Pjuridica consultaPJuridicaWs(Integer id){
		return daoJ.wsPessoajuridica(id);
	}
	
	@Transacao
	public void salvarWs(Cliente cliente) {
		try {
			if (cliente.getIdpessoa() == null) {
				dao.salvar(cliente);
			} 			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transacao
	public void salvaWsPfisica(Pfisica pfisica){
		try{
			daoF.salvar(pfisica);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Transacao
	public void salvaWsPjuridica(Pjuridica p){
		try{
			daoJ.salvar(p);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
