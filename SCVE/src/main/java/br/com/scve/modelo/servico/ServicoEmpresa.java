package br.com.scve.modelo.servico;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Pfisica;
import br.com.scve.entidades.Pjuridica;
import br.com.scve.entidades.Vendedor;
import br.com.scve.entidades.WsVendedor;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.scve.entidades.Contato;
import br.com.scve.entidades.Empresa;
import br.com.scve.entidades.Endereco;
import br.com.scve.modelo.dao.DAOEmpresa;
import br.com.scve.modelo.dao.DAOPfisica;
import br.com.scve.modelo.dao.DAOPjuridica;
import br.com.scve.modelo.dao.DAOVendedor;
import br.com.scve.modelo.dao.DAOWsVendedor;
//import br.com.scve.modelo.dao.DAOContato;
//import br.com.scve.modelo.dao.DAOEndereco;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private DAOEmpresa dao;
	@Inject
	private DAOPfisica daoF;
	@Inject
	private DAOPjuridica daoJ;


	@Transacao
	public void salvar(Empresa empresa, Pfisica pfisica, Pjuridica pjuridica, String tipoP, List<Contato> contatos, List<Endereco> enderecos) {
		try {
			
			if (empresa.getIdpessoa() == null) {
				empresa.setTipojf(tipoP);
				dao.salvar(empresa);
				//daoC.salvarList(contatos);
				//daoEnde.salvarList(enderecos);
				if (empresa.getTipojf().equals("F")) {
					pfisica.setPessoa(empresa);
					daoF.salvar(pfisica);
				} else {
					pjuridica.setPessoa(empresa);
					daoJ.salvar(pjuridica);
				}

			} else {
				empresa.setTipojf(tipoP);
				dao.alterar(empresa);
				//daoC.alterarList(contatos);
				//daoEnde.alterarList(enderecos);
				if (empresa.getTipojf().equals("F")) {
					if (pfisica.getPessoa() == null){
						daoJ.excluir(empresa.getIdpessoa());
						pfisica.setPessoa(empresa);
						daoF.salvar(pfisica);						
					}else{
					daoF.alterar(pfisica);
					}
					
				} else {
					if (pjuridica.getPessoa() == null){
						daoF.excluir(empresa.getIdpessoa());
						pjuridica.setPessoa(empresa);
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

	public List<Empresa> consultar() {
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
	
	
	public List<Empresa> consultarAtivos(){
		return dao.consultarAtivos();
	}	
	
}
