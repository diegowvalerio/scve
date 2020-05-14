package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Cnae;
import br.com.scve.modelo.dao.DAOCnae;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoCnae implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOCnae dao;
	
	@Transacao
	public void salvar(Cnae cnae){
		try {
			if(cnae.getIdcnae() == null){
				dao.salvar(cnae);
			}else{
				dao.alterar(cnae);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Cnae> consultar(){
		return dao.consultar();
	}
	
	
}
