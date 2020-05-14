package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Ncm;
import br.com.scve.modelo.dao.DAONcm;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoNcm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAONcm dao;
	
	@Transacao
	public void salvar(Ncm ncm){
		try {
			if(ncm.getIdncm() == null){
				dao.salvar(ncm);
			}else{
				dao.alterar(ncm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Ncm> consultar(){
		return dao.consultar();
	}
	
	
}
