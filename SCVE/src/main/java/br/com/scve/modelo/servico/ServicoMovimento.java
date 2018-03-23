package br.com.scve.modelo.servico;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import br.com.scve.entidades.Movimento;
import br.com.scve.modelo.dao.DAOMovimento;
import br.com.scve.modelo.dao.hibernate.Transacao;

@Dependent
public class ServicoMovimento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private DAOMovimento dao;
	
	@Transacao
	public void salvar(Movimento movi){
		try {
			if(movi.getIdmov() == null){
				dao.salvar(movi);
			}else{
				dao.alterar(movi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Transacao
	public boolean excluir(Integer id){
		return dao.excluir(id);
	}
	
	public List<Movimento> consultar(){
		return dao.consultar();
	}
	

}